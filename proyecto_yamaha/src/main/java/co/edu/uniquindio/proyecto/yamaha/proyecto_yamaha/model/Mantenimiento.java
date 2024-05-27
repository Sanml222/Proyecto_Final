package co.edu.uniquindio.proyecto.yamaha.proyecto_yamaha.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mantenimiento {

    enum ESTADOS {PENDIENTE, TERMINADO}
    private LocalDate fecha;

    private ESTADOS estado;
    private String descripcion;

    public Mantenimiento(LocalDate fecha, String estadoString, String descripcion) {
        this.fecha = fecha;
        this.estado = obtenerEstado(estadoString);
        this.descripcion = descripcion;
    }

    private ESTADOS obtenerEstado(String estadoString) {
        try {
            return ESTADOS.valueOf(estadoString);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Estado no valido");
            return null;
        }
    }

    public String getFechaString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return fecha.format(formatter);
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public ESTADOS getEstado() {
        return estado;
    }

    public String getEstadoString()
    {
        return estado.name();
    }

    public void setEstado(ESTADOS estado) {
        this.estado = estado;
    }

    public void cambiarEstado(String estadoString)
    {
        this.estado = obtenerEstado(estadoString);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
