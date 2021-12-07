package Modelos;

import java.util.Date;

/**
 *
 * @author Esmeralda
 */
public class Cliente {

    private int cedula;
    private String nombre;
    private Date fechanacimiento;
    private int telefono;
    private String correo;
    private int edad; //no se guarda en la base de datos.

    public Cliente(int cedula, String nombre, Date fechanacimiento, int telefono, String Correo, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechanacimiento = fechanacimiento;
        this.telefono = telefono;
        this.correo = Correo;
        this.edad = edad;
    }

    

    public Cliente() {
        this(0, null, null, 0, null, 0);
    }

    public boolean comprobar() {
        return this.telefono > 0 && this.cedula > 0 && this.nombre != null && this.correo!= null && this.fechanacimiento != null;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
