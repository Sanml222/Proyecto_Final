package co.edu.uniquindio.proyecto.yamaha.proyecto_yamaha.model.builder;

import co.edu.uniquindio.proyecto.yamaha.proyecto_yamaha.model.Persona;

public class PersonaBuilder {

    protected String nombre;

    protected String cedula;

    protected String email;

    protected String celular;

    protected int edad;

    public PersonaBuilder nombre(String nombre){
        this.nombre = nombre;
        return this;
    }
    public PersonaBuilder cedula(String cedula){
        this.cedula = cedula;
        return this;
    }
    public PersonaBuilder email(String email){
        this.email = email;
        return this;
    }
    public PersonaBuilder celular(String celular){
        this.celular = celular;
        return this;
    }
    public PersonaBuilder edad(int edad){
        this.edad = edad;
        return this;
    }
    public Persona build() {
        return new Persona(nombre, cedula, email, celular, edad);
    }

}
