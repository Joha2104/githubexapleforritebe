package Modelos;

import java.util.Date;

/**
 *
 * @author Esmeralda
 */
public class Usuario {

    private int cedula;
    private int telefono;
    private Date fechanacimiento;
    private String nombre;
    private String correo;
    private String sobrenombre;
    private String contraseña;
    private String tipo;       //tecnico/secretario

    public Usuario(int cedula, int telefono, Date fechanacimiento, String nombre, String correo, String sobrenombre, String contraseña, String tipo) {
        this.cedula = cedula;
        this.telefono = telefono;
        this.fechanacimiento = fechanacimiento;
        this.nombre = nombre;
        this.correo = correo;
        this.sobrenombre = sobrenombre;
        this.contraseña = contraseña;
        this.tipo = tipo;
    }

    public Usuario() {
        this(0, 0, null, null, null, null, null, null);
    }

    //ver si es realmente le usaurio
    public boolean comprobar() {
        return this.cedula > 0 && this.telefono > 0 && this.fechanacimiento != null && this.nombre != null && this.correo != null
                && this.sobrenombre != null && this.contraseña != null && this.tipo != null;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSobrenombre() {
        return sobrenombre;
    }

    public void setSobrenombre(String sobrenombre) {
        this.sobrenombre = sobrenombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
