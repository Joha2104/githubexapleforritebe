package Controladores;

import BD.Conexion;
import Modelos.Cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import Modelos.Cita;
import Vista.FrmMenu;

/**
 *
 * @author Esmeralda
 */
public class ControladorCitas {

    private Conexion conn;
    private Statement sentencias;
    private ResultSet datos;
    private ControladorClientes ccliente = new ControladorClientes();
    private Cliente cliente;
    private Statement sentencias2;

    public ControladorCitas() {

        conn = FrmMenu.getConexion();
        try {
            this.sentencias2 = FrmMenu.getConexion().getConn().createStatement();
        } catch (SQLException ex) {
            System.out.println("Error al crear otra sentencia");
        }
        this.sentencias = conn.getSentencia();
        this.datos = conn.getDatos();
    }

    public ControladorCitas(Conexion conn) {
        this.conn = conn;
        this.sentencias = conn.getSentencia();
        this.datos = conn.getDatos();
    }

    public boolean añadir(Cita cita) {
        try {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            sentencias.execute("insert into citas values(null,'" + f.format(cita.getFecha()) + "','" + cita.getHora() + "','" + cita.getCliente().getCedula() + "','" + cita.getEstado() + "')");
            return true;
        } catch (SQLException ex) {
            System.out.println("Error al añadir");
            System.out.println(ex);
        }
        return false;
    }

    public Cita buscar(Cita cita) {
        try {
            this.datos = this.sentencias2.executeQuery("select * from citas where Id=" + cita.getId());
            if (datos.next()) {
                cliente = new Cliente();
                cliente.setCedula(datos.getInt(4));
                cliente = ccliente.buscar(cliente);
                Cita cita2 = new Cita(datos.getInt(1), datos.getDate(2), String.valueOf((3)), cliente, datos.getString(5));
                if (CambiarEstadoCita(cita2)) {
                    
                    //si la fecha se vencio desactivamos la cita 
                    actualizar(cita2);
                }
                return cita2;
            }
        } catch (SQLException ex) {
            System.out.println("Error al buscar");
            System.out.println(ex);
        }
        return null;
    }

    public boolean eliminar(Cita cita) {
        try {
            this.sentencias.executeUpdate("delete from citas where id=" + cita.getId());
            return true;
        } catch (SQLException ex) {
            System.out.println("Error al borrar");
        }
        return false;
    }

    public boolean actualizar(Cita cita) {
        try {
            this.sentencias.executeUpdate("UPDATE citas SET fecha='" + cita.getFecha() + "', hora='" + cita.getHora() + "', estado='" + cita.getEstado() + "'  WHERE id ='" + cita.getId() + "';");
            return true;
        } catch (SQLException ex) {
            System.out.println("Error al actualizar");
        }
        return false;
    }
    
    /*
    este metodo recibe una cita y devuelve un arraylist con la citas que tengan la misma fecha
    @param cita recibe una cita 
    @return Arraylist de citas
    */
    public ArrayList<Cita> listarPorFecha(Cita cita){       
        ArrayList<Cita> citas = new ArrayList();
            try {               
                SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");               
                this.datos = this.sentencias2.executeQuery("select * from citas");
                System.out.println(this.datos);
                
                //si se encontro resultados en la consulta se guardan en el arrayList
                while(datos.next()){
                    cliente = new Cliente();
                    cliente.setCedula(datos.getInt(4));
                    Cita cita2 = new Cita(datos.getDate(2),String.valueOf(datos.getTime(3)), ccliente.buscar(cliente));
                    System.out.println(datos.getInt(4));
                    if( CambiarEstadoCita(cita2) ){
                        //si la fecha se vencio desactivamos la cita 
                        actualizar(cita2);
                    }                    
                    citas.add(cita2);
                }
                //si se encontro una cita o más, las retornamos
                if(citas.size()>0){
                    return citas;
                }
            } catch (SQLException ex) {
                System.out.println("Error al listar");
                System.out.println(ex);
            }
        return null; 
    }
        
    public boolean validarPK(Cita cita) {       
        try{         
            this.datos = this.sentencias.executeQuery("select * from citas where cedula_cliente = '"+cita.getCliente().getCedula()+"'  AND estado = 'activado'  ;");          
            if (datos.next()){          
                return false;
            }               
        } catch (SQLException ex){
            System.out.println("Error al validarPK");          
        }        
        return true;     
    }
    
    /**
     * valida cuantas citas hay 
     * @param cita recibe una cita
     * @return retorna verdadero si no existen citas en una fecha ó si tiene menos de 4 citas en una fecha; retorna falso de lo contrario
     */
    public boolean ValidarCantCitas(Cita cita) {       
     //si está vacio ó hay menos de 4 citas   
     return listarPorFecha(cita) == null || listarPorFecha(cita).size()<4;    
    }
     
    //valida que exista un cliente para poder agregar una cita
    public boolean ValidarFK(Cita cita){        
        try{
            this.datos = this.sentencias.executeQuery("select * from clientes where cedula="+cita.getCliente().getCedula());
                
            if (datos.next()){
                return true;
            }               
        } catch (SQLException ex){
            System.out.println("Error al validarFK");            
        }        
        return false;      
    }
      
    /*
    utiliza la fecha del parametro cita y la compara con la fecha actual
    @param cita 
    @return verdadero si la fecha es menor
    */
    
    private boolean CambiarEstadoCita(Cita cita ) {
        Date fechaActual = new Date();       
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
        
       //se utiliza para que el compareto funcione correctamente
        try {
            fechaActual = f.parse(f.format(fechaActual));
        }catch (ParseException ex) {  
        }  
        
        System.out.println("fecha actual :"+fechaActual+"--fecha de la cita:"+cita.getFecha() );
        if ( cita.getFecha().compareTo(fechaActual)<0 ) {
            cita.setEstado("desactivado");
            System.out.println("La Fecha es menor :"+cita.getFecha().compareTo(fechaActual));
            return true;       
        }else{       
            if (   cita.getFecha().compareTo(fechaActual)>0 ) {
                System.out.println("La Fecha es mayor :"+cita.getFecha().compareTo(fechaActual));
                return false;                    
            }else{
                
                System.out.println("La Fecha es Igual :"+cita.getFecha().compareTo(fechaActual));
                return false;          
            }
        
        }          
    }
}
