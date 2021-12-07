package Controladores;

import BD.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import Modelos.Cliente;
import Modelos.Tecnico;
import Modelos.Prueba;
import Vista.FrmMenu;

/**
 *
 * @author Esmeralda
 */
public class ControladorPruebas {
    private Conexion conn;
    private Statement sentencias;
    private ResultSet datos;
    private ControladorTecnico conOficiales;
    private Tecnico tecnico;
    private Cliente cliente;
    private ControladorClientes conCliente;
    
    public ControladorPruebas() {
       
       conn = FrmMenu.getConexion();
       this.sentencias= conn.getSentencia();
       this.datos=conn.getDatos();
       
    }

    public ControladorPruebas(Conexion conn) {
        this.conn = conn;
        this.sentencias= conn.getSentencia();
        this.datos=conn.getDatos();
        this.conCliente = new ControladorClientes();
        this.conOficiales = new ControladorTecnico();
    }
    
        public boolean añadir(Prueba prueba){
        try {
           SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(prueba.getFechaPrueba()));
            System.out.println(prueba.getHora());
         // System.out.println("insert into pruebas values(null,'"+f.format(prueba.getFechaPrueba())+"','"+prueba.getHora()+"','"+prueba.getTecnico().getCedula()+"','"+prueba.getCliente().getCedula()+"','"+prueba.getObservaciones()+"','"+prueba.getNota()+"','"+prueba.getEstado()+"')");
            sentencias.execute("insert into pruebas values(null,'"+f.format(prueba.getFechaPrueba())+"','"+prueba.getHora()+"','"+prueba.getTecnico().getCedula()+"','"+prueba.getCliente().getCedula()+"','"+prueba.getObservaciones()+"','"+prueba.getNota()+"','"+prueba.getEstado()+"')");
            return true;                      
        } catch (SQLException ex) {
            System.out.println("Error al añadir");
            System.out.println(ex.getMessage());
        }   
        return false;
    }
    
    public Prueba buscar(Prueba prueba){
        try {            
            this.datos = this.sentencias.executeQuery("select * from pruebas where cedula_cliente="+prueba.getCliente().getCedula());           
            if(datos.next()){             
                //Para poder buscar el tecnico
                tecnico = new Tecnico();
                tecnico.setCedula(datos.getInt(4));
                cliente = new Cliente();
                cliente.setCedula(datos.getInt(5));                    
                Prueba prueba2 = new Prueba(datos.getDate(2),datos.getTime(3).toString(),this.conOficiales.buscar(tecnico),this.conCliente.buscar(cliente),datos.getString(6),datos.getInt(7),datos.getInt(8));
                return prueba2;
            }                 
        }catch (SQLException ex) {
            System.out.println("Error al buscar");
        }
        return null;
    }
        
    public boolean eliminar(Prueba prueba){
        try {
            this.sentencias.executeUpdate("delete from pruebas where cedula_cliente="+prueba.getCliente().getCedula());
            return true;           
        } catch (SQLException ex) {               
            System.out.println("Error al borrar");
        }
        return false;
    }
    
    public boolean actualizar(Prueba prueba){       
        try {                
            this.sentencias.executeUpdate("UPDATE pruebas SET nota='"+prueba.getNota()+"' WHERE cedula_oficial='"+prueba.getTecnico().getCedula()+"';");
            return true;            
        } catch (SQLException ex) {
            System.out.println("Error al actualizar");
        }
        return false;
    } 
        
    public ArrayList<Prueba> listar(){
        ArrayList<Prueba> pruebas = new ArrayList();
        try {
            this.datos = this.sentencias.executeQuery("select * from pruebas");
            while(datos.next()){
                tecnico = new Tecnico();
                tecnico.setCedula(datos.getInt(4));
                cliente = new Cliente();
                cliente.setCedula(datos.getInt(5));
                pruebas.add(new Prueba(datos.getDate(2),datos.getTime(3).toString(),this.conOficiales.buscar(tecnico),this.conCliente.buscar(cliente),datos.getString(6),datos.getInt(7),datos.getInt(8)));
            }
            return pruebas;
        } catch (SQLException ex) {
            System.out.println("Error al listar"+ex.getMessage());
        }
        return null; 
    }
    
    //validamos para poder agregar si realmente esta el tecnico
    public boolean ValidarFKOficial(Prueba prueba){
        try{
            this.datos = this.sentencias.executeQuery("select * from tecnicos where cedula="+prueba.getTecnico().getCedula());                
            if (datos.next()) 
            {            
                return true;              
            }                
        } catch (SQLException ex){
            System.out.println("Error al validar Tecnico");            
        }         
        return false;      
    }
    
    //Valida que exista una cita de ese cliente
    public boolean ValidarFKCliente(Prueba prueba){
        try {
            this.datos = this.sentencias.executeQuery("select * from citas where Cedula="+prueba.getCliente().getCedula());                
            if (datos.next()){            
                return true;             
            }                
        } catch (SQLException ex){
            System.out.println("Error al validarFKCliente");           
        }         
        return false;      
    }
    
    //valida que exista una cita con esa fecha para poder agregar una prueba
    public boolean ValidarFKFecha(Prueba prueba){
        try {
            this.datos = this.sentencias.executeQuery("select * from citas where FechaPrueba="+prueba.getFechaPrueba());                
            if (datos.next()){            
                return true;              
            }               
        } catch (SQLException ex){
            System.out.println("Error al validarFKFecha");            
        }         
        return false;       
    }
    
    //valida que exista una cita con esa hora para poder agregar una prueba ojo
    public boolean ValidarFKHora(Prueba prueba){
        try{
            this.datos = this.sentencias.executeQuery("select * from citas where hora="+prueba.getHora());                
            if (datos.next()){           
                return true;              
            }                
        } catch (SQLException ex){
            System.out.println("Error al validarFKHora");           
        }         
        return false;       
    }      
}
