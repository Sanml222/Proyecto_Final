package co.edu.uniquindio.proyecto.yamaha.proyecto_yamaha.model;

import co.edu.uniquindio.proyecto.yamaha.proyecto_yamaha.model.builder.ClienteBuilder;


public class Cliente extends Persona {

    public Cliente(String nombre, String cedula, String email, String celular, int edad) {
        super(nombre, cedula, email, celular, edad);

    }
    public static ClienteBuilder builder(){
        return new ClienteBuilder();
    }


}
