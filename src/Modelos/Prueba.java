package Modelos;

import java.util.Date;

/**
 *
 * @author Esmeralda
 */
public class Prueba {

    private Date fecha;
    private String hora;
    private Tecnico tecnico;// tecnico que va realizar la Prueba enviamos la cedula a db para relacionar el oficial
    private Cliente cliente;// se envia el cliente de tipo otributo objeto
    private String observaciones;
    private int nota;
    private int estado;//aprobado-reprobado

    public Prueba(Date fechaprueba, String hora, Tecnico tecnico, Cliente cliente, String observaciones, int nota, int estado) {
        this.fecha = fecha;
        this.hora = hora;
        this.tecnico = tecnico;
        this.cliente = cliente;
        this.observaciones = observaciones;
        this.nota = nota;
        this.estado = estado;
    } 

    public Prueba() {
        this(null, null, null, null, null, 0, 0);
    }

    public Date getFechaPrueba() {
        return fecha;
    }

    public void setFechaPrueba(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

}
