package co.edu.uniquindio.proyecto.yamaha.proyecto_yamaha.model;


import co.edu.uniquindio.proyecto.yamaha.proyecto_yamaha.model.interfaces.DistribuidoraModelInterface;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora implements DistribuidoraModelInterface {

private static Distribuidora instancia;
    ArrayList<Cliente> listaClientesDistribuidora = new ArrayList<Cliente>();
    List<Empleado> listaEmpleadosDistribuidora = new ArrayList<Empleado>();


    public Distribuidora(){}

    public static Distribuidora getInstancia(){
        if(instancia == null){
            instancia = new Distribuidora();
        }
        return instancia;
    }

    public boolean crearEmpleado(String nombre,
                                String cedula,
                                String email,
                                String celular,
                                int edad,String tipo){
        Empleado empleadoEncontrado = obtenerEmpleado(cedula);
        if(empleadoEncontrado == null){
            Empleado empleado = getBuildEmpleado(nombre, cedula, email, celular, edad, tipo);
            getListaEmpleadosDistribuidora().add(empleado);
            return true;
        }else{
            return  false;
        }
    }
    public boolean crearEmpleado(Empleado nuevoEmpleado){
        Empleado empleadoEncontrado = obtenerEmpleado(nuevoEmpleado.getCedula());
        if(empleadoEncontrado == null){
            getListaEmpleadosDistribuidora().add(nuevoEmpleado);
            return true;
        }else{
            return  false;
        }
    }
    private Empleado getBuildEmpleado(String nombre, String cedula, String email, String celular, int edad, String tipo) {
        return Empleado.builder()
                .nombre(nombre)
                .cedula(cedula)
                .email(email)
                .celular(celular)
                .edad(edad)
                .tipo(tipo)
                .build();
    }


    public ArrayList<Cliente> getListaClientesDistribuidora() {
        return listaClientesDistribuidora;
    }

    public void setListaClientesDistribuidora(ArrayList<Cliente> listaClientesDistribuidora) {
        this.listaClientesDistribuidora = listaClientesDistribuidora;
    }

    public List<Empleado> getListaEmpleadosDistribuidora() {
        return listaEmpleadosDistribuidora;
    }

    public void setListaEmpleadosDistribuidora(ArrayList<Empleado> listaEmpleadosDistribuidora) {
        this.listaEmpleadosDistribuidora = listaEmpleadosDistribuidora;
    }

    @Override
    public Empleado agregarEmpleado(Empleado nuevoEmpleado) {

        listaEmpleadosDistribuidora.add(nuevoEmpleado);

        return nuevoEmpleado;
    }

    @Override
    public Empleado obtenerEmpleado(String cedula) {

        Empleado empleado = null;
        for (Empleado empleado1: getListaEmpleadosDistribuidora()) {
            if(empleado1.getCedula().equalsIgnoreCase(cedula)){
                empleado = empleado1;
                break;
            }
        }

        return empleado;
    }

    @Override
    public boolean actualizarEmpleado(Empleado empleadoActualizado) {

        for (int i = 0; i < listaEmpleadosDistribuidora.size(); i++){
            if(listaEmpleadosDistribuidora.get(i).getCedula().equals(empleadoActualizado.getCedula())){

                listaEmpleadosDistribuidora.set(i, empleadoActualizado);

                return true;
            }
        }

        return false;
    }

    @Override
    public boolean eliminarEmpleado(String cedula) {

        for (int i = 0; i < listaEmpleadosDistribuidora.size(); i++){
            if(listaEmpleadosDistribuidora.get(i).getCedula().equals(cedula)){

                listaEmpleadosDistribuidora.remove(i);

                return true;
            }
        }
        return false;
    }
}
