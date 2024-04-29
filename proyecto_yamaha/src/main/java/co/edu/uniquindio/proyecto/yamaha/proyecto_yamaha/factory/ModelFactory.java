package co.edu.uniquindio.proyecto.yamaha.proyecto_yamaha.factory;

import co.edu.uniquindio.proyecto.yamaha.proyecto_yamaha.model.Distribuidora;
import co.edu.uniquindio.proyecto.yamaha.proyecto_yamaha.model.Empleado;


import java.util.List;

public class ModelFactory  {

    private static ModelFactory modelFactory;

    private Distribuidora distribuidora;
    private ModelFactory(){
        distribuidora = new Distribuidora();
        inicializarDatos();
    }

    public static ModelFactory getInstancia(){
        if(modelFactory == null){
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    private void inicializarDatos() {
        inicializarDatosEmpleado();
    }
    private void inicializarDatosEmpleado(){

        Empleado empleado1 = Empleado.builder()
                .nombre("Santiago")
                .cedula("1090274004")
                .email("santiagoml222@gmail.com")
                .celular("3147904473")
                .edad(18)
                .tipo("ADMIN")
                .build();

        Empleado empleado2 = Empleado.builder()
                .nombre("Nicole")
                .cedula("112233")
                .email("ngjx__@gmail.com")
                .celular("3331212121")
                .edad(20)
                .tipo("ADMIN")
                .build();

        Empleado empleado3 = Empleado.builder()
                .nombre("Samuel")
                .cedula("334567321")
                .email("samuel9865@gmail.com")
                .celular("9953679035")
                .edad(33)
                .tipo("ADMIN")
                .build();

        Empleado empleado4 = Empleado.builder()
                .nombre("kevin")
                .cedula("108765")
                .email("kcr02@gmail.com")
                .celular("7786542091")
                .edad(28)
                .tipo("ADMIN")
                .build();

        Empleado empleado5 = Empleado.builder()
                .nombre("Paula")
                .cedula("075462")
                .email("22ps22@gmail.com")
                .celular("2265438717")
                .edad(22)
                .tipo("VENDEDOR")
                .build();

        distribuidora.getListaEmpleadosDistribuidora().add(empleado1);
        distribuidora.getListaEmpleadosDistribuidora().add(empleado2);
        distribuidora.getListaEmpleadosDistribuidora().add(empleado3);
        distribuidora.getListaEmpleadosDistribuidora().add(empleado4);
        distribuidora.getListaEmpleadosDistribuidora().add(empleado5);
    }
    public boolean crearEmpleado(String nombre,
                                 String cedula,
                                 String email,
                                 String celular,
                                 int edad,String tipo){
        return distribuidora.crearEmpleado(nombre, cedula, email, celular, edad, tipo);
    }
    public boolean crearEmpleado(Empleado empleado){
        return distribuidora.crearEmpleado(empleado);
    }


    public List<Empleado> obtenerEmpleados() {
        return distribuidora.getListaEmpleadosDistribuidora();
    }


    public boolean actualizarEmpleado(Empleado empleadoActualizado) {
        return distribuidora.actualizarEmpleado(empleadoActualizado);

    }

    public boolean eliminarEmpleado(Empleado empleadoSeleccionado) {
        return distribuidora.eliminarEmpleado(empleadoSeleccionado.getCedula());
    }
}
