package Modelos;

import java.util.Date;

/**
 *
 * @author Esmeralda
 */
public class Tecnico {

    private int cedula;
    private int telefono;
    private Date fechanacimiento;
    private String nombre;
    private String correo;
    private double salario;

    public Tecnico(int cedula, int telefono, Date fechanacimiento, String nombre, String correo, double salario) {
        this.cedula = cedula;
        this.telefono = telefono;
        this.fechanacimiento = fechanacimiento;
        this.nombre = nombre;
        this.correo = correo;
        this.salario = salario;
    }

    public Tecnico() {
        this(0, 0, null, null, null, 0);
    }

    public boolean comprobar() {
        return this.cedula > 0 && this.telefono > 0 && this.fechanacimiento != null && this.nombre != null && this.correo != null && this.salario > 0;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
