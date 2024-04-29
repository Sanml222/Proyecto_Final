package co.edu.uniquindio.proyecto.yamaha.proyecto_yamaha;

import co.edu.uniquindio.proyecto.yamaha.proyecto_yamaha.model.Empleado;
import co.edu.uniquindio.proyecto.yamaha.proyecto_yamaha.model.builder.EmpleadoBuilder;

public class Test {
    public static void main(String[] args) {

        Empleado empleadoSeleccionado = new Empleado("ss", "21212", "sasad", "2323", 22, "ADMIN");

        System.out.print(empleadoSeleccionado);

        EmpleadoBuilder empleadoBuilder = new EmpleadoBuilder()
                .nombre(empleadoSeleccionado.getNombre())
                .cedula(empleadoSeleccionado.getCedula())
                .email(empleadoSeleccionado.getEmail())
                .celular(empleadoSeleccionado.getCelular())
                .edad(empleadoSeleccionado.getEdad())
                .tipo(empleadoSeleccionado.getTipoString());


        Empleado empleadoActualizado = empleadoBuilder.nombre("fff").email("d34f").build();

        System.out.print(empleadoActualizado);
//        Empleado empleado1 = Empleado.builder()
//                .nombre("Santiago")
//                .cedula("1090274004")
//                .email("santiagoml222@gmail.com")
//                .celular("3147904473")
//                .edad(18)
//                .tipo("ADMIN")
//                .build();
//
//
//        System.out.print(empleado1);


    }
}
