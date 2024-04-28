package co.edu.uniquindio.proyecto.yamaha.proyecto_yamaha.model;

import co.edu.uniquindio.proyecto.yamaha.proyecto_yamaha.model.interfaces.DistribuidoraModelInterface;

import java.util.ArrayList;

public class Distribuidora implements DistribuidoraModelInterface {

private static Distribuidora instancia;
    ArrayList<Cliente> listaClientesDistribuidora = new ArrayList<Cliente>();
    ArrayList<Empleado> listaEmpleadosDistribuidora = new ArrayList<Empleado>();

    public Distribuidora(){}

    public static Distribuidora getInstancia(){
        if(instancia == null){
            instancia = new Distribuidora();
        }
        return instancia;
    }

    public ArrayList<Cliente> getListaClientesDistribuidora() {
        return listaClientesDistribuidora;
    }

    public void setListaClientesDistribuidora(ArrayList<Cliente> listaClientesDistribuidora) {
        this.listaClientesDistribuidora = listaClientesDistribuidora;
    }

    public ArrayList<Empleado> getListaEmpleadosDistribuidora() {
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

        for(Empleado empleado: listaEmpleadosDistribuidora){

            if(cedula.equals(empleado.getCedula())){
                return empleado;
            }
        }

        return null;
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
