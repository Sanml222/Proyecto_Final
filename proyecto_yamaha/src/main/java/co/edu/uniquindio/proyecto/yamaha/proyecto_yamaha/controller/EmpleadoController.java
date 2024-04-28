package co.edu.uniquindio.proyecto.yamaha.proyecto_yamaha.controller;

import co.edu.uniquindio.proyecto.yamaha.proyecto_yamaha.controller.interfaces.EmpleadoControllerInterface;
import co.edu.uniquindio.proyecto.yamaha.proyecto_yamaha.model.Distribuidora;
import co.edu.uniquindio.proyecto.yamaha.proyecto_yamaha.model.Empleado;

import java.util.ArrayList;

public class EmpleadoController implements EmpleadoControllerInterface {

    Distribuidora distribuidora = Distribuidora.getInstancia();
    @Override
    public Empleado crearEmpleado(String nombre, String cedula, String email, String celular, int edad, String tipo) {

        Empleado empleado = new Empleado(nombre, cedula, email, celular, edad, tipo);

        distribuidora.agregarEmpleado(empleado);


        return empleado;
    }

    @Override
    public Empleado obtenerEmpleado(String cedula) {

        return distribuidora.obtenerEmpleado(cedula);
    }

    @Override
    public boolean actualizarEmpleado(Empleado empleadoActualizado) {
        return distribuidora.actualizarEmpleado(empleadoActualizado);
    }

    @Override
    public boolean eliminarEmpleado(String cedula) {
        return distribuidora.eliminarEmpleado(cedula);
    }
}
