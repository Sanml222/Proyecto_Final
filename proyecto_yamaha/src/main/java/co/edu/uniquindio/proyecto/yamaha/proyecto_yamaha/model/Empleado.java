package co.edu.uniquindio.proyecto.yamaha.proyecto_yamaha.model;

import co.edu.uniquindio.proyecto.yamaha.proyecto_yamaha.model.builder.EmpleadoBuilder;

import java.util.ArrayList;

public class Empleado extends Persona{

    enum Roles {ADMIN, VENDEDOR};

    private Roles tipo;

    ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public Empleado(String nombre, String cedula, String email, String celular, int edad, String tipoString) {
        super(nombre, cedula, email, celular, edad);
        this.tipo = obteneRol(tipoString);
    }

    public static EmpleadoBuilder builder(){
        return new EmpleadoBuilder();
    }

    private Roles obteneRol(String tipo){

        if (tipo.equals(Roles.ADMIN.name())){
            return Roles.ADMIN;

        }
        return Roles.VENDEDOR;
    }

    public Roles getTipo() {
        return tipo;
    }

    public String getTipoString() {
        return tipo.name();
    }

    public void setTipo(Roles tipo) {
        this.tipo = tipo;
    }

    public boolean agregarClienteLista(Cliente nuevoCliente){

        return listaClientes.add(nuevoCliente);
    }
    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + this.getNombre() + '\'' +
                ", cedula='" + this.getCedula() + '\'' +
                ", email='" + this.getEmail() + '\'' +
                ", Celular='" + this.getCelular() + '\'' +
                ", edad=" + this.getEdad() + '\'' +
                ", tipo=" + this.getTipo() + '\'' +
                '}';
    }
}
