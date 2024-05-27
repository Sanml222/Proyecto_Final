package co.edu.uniquindio.proyecto.yamaha.proyecto_yamaha.model;

public class Moto extends Producto {


    enum TipoMoto {AUTOMATICA, SEMIAUTOMATICA, URBANA, TODOTERRENO, DEPORTIVAS, MOTOCROSS}
    private TipoMoto tipo;
    private String cilindraje;

    public Moto(String nombre, float precio, int cantidad, String descripcion, String tipoString, String cilindraje ) {
        super(nombre, precio, cantidad, descripcion);
        this.tipo = obtenerTipoMoto(tipoString);
        this.cilindraje = cilindraje;
    }
    private TipoMoto obtenerTipoMoto(String tipoString) {
        try
        {
            return TipoMoto.valueOf(tipoString);
        } catch (IllegalArgumentException e){
            System.out.println("Tipo no disponible");
            return null;
        }


    }
    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }
    public String getTipo() {
        return tipo.name();
    }

    @Override
    public String getTipoProducto() {
        return "MOTO";
    }
}
