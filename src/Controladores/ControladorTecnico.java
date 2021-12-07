package Controladores;

import BD.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import Modelos.Tecnico;
import Vista.FrmMenu;

/**
 *
 * @author Esmeralda
 */
public class ControladorTecnico {
    private Conexion conn;
    private Statement sentencias;
    private ResultSet datos;
    
    public ControladorTecnico() {
       
       conn = FrmMenu.getConexion();
       this.sentencias= conn.getSentencia();
       this.datos=conn.getDatos();
    }

    public ControladorTecnico(Conexion conn) {
        this.conn = conn;
        this.sentencias= conn.getSentencia();
        this.datos=conn.getDatos();
    }
    
    public boolean añadir(Tecnico tecnico){
        try {            
           SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
           sentencias.execute("insert into tecnicos values(null,"+tecnico.getCedula()+",'"+tecnico.getNombre()+"','"+f.format(tecnico.getFechanacimiento())+"',"+tecnico.getTelefono()+",'"+tecnico.getCorreo()+"',"+tecnico.getSalario()+")");
           return true;           
        } catch (SQLException ex) {
            System.out.println("Error al añadir"+ex.getMessage());
        }
        return false;
    }
        
    public Tecnico buscar(Tecnico tecnico){
        try {            
            this.datos = this.sentencias.executeQuery("select * from tecnicos where cedula="+tecnico.getCedula());               
            if(datos.next()){                                 
                Tecnico tecnico2 = new Tecnico();
                tecnico2.setCedula(datos.getInt(2));
                tecnico2.setNombre(datos.getString(3));
                tecnico2.setFechanacimiento(datos.getDate(4));
                tecnico2.setTelefono(datos.getInt(5));
                tecnico2.setCorreo(datos.getString(6));
                tecnico2.setSalario(datos.getDouble(7));
                    
                return tecnico2;
            }                 
        }catch (SQLException ex) {
            System.out.println("Error al buscar");
        }
        return null;
    }
        
    public boolean eliminar(Tecnico tecnico){
        try {
            this.sentencias.executeUpdate("delete from tecnicos where cedula="+tecnico.getCedula());
            return true;            
        } catch (SQLException ex) {                
            System.out.println("Error al borrar");
        }
        return false;
    }
    
    public boolean actualizar(Tecnico tecnico){        
        try {                
            this.sentencias.executeUpdate("UPDATE tecnicos SET nombre='"+tecnico.getNombre()+"' WHERE cedula ='"+tecnico.getCedula()+"';");
            return true;            
        } catch (SQLException ex) {
            System.out.println("Error al actualizar");
        }
        return false;
    }    
        
    public ArrayList<Tecnico> listar(){
        ArrayList<Tecnico> tecnicos = new ArrayList();
        try {
            this.datos = this.sentencias.executeQuery("select * from tecnicos");                
            while(datos.next()){
                tecnicos.add(new Tecnico(datos.getInt(2),datos.getInt(5),datos.getDate(4),datos.getString(3),datos.getString(6),datos.getDouble(7)));               
            }
            return tecnicos;
        } catch (SQLException ex) {
            System.out.println("Error al listar");
        }
        return null; 
    }   
}
