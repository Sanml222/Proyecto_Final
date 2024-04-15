module co.edu.uniquindio.proyecto.yamaha.proyecto_yamaha {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.proyecto.yamaha.proyecto_yamaha to javafx.fxml;
    exports co.edu.uniquindio.proyecto.yamaha.proyecto_yamaha;
}