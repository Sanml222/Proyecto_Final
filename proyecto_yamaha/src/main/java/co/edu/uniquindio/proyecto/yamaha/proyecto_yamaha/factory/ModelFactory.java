package co.edu.uniquindio.proyecto.yamaha.proyecto_yamaha.factory;

import java.util.List;

public class ModelFactory  {

    private static ModelFactory modelFactory;

    private ModelFactory(){
    }
    public static ModelFactory getInstancia(){
        if(modelFactory == null){
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }
    
}
