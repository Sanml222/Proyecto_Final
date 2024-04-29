package co.edu.uniquindio.proyecto.yamaha.proyecto_yamaha;

import co.edu.uniquindio.proyecto.yamaha.proyecto_yamaha.viewController.AplicacionView;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private Stage primaryStage;
    private BorderPane rootLayaut;

    @Override
    public void start(Stage stage) throws IOException {
        this.primaryStage = stage;
        this.primaryStage.setTitle("Distribuidora Motos");
        mostrarVentanaPrincipal();
    }
    public void mostrarVentanaPrincipal() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("aplicacion-view.fxml"));
            AnchorPane rootLayout = (AnchorPane) fxmlLoader.load();
            AplicacionView bancoViewController = fxmlLoader.getController();
//            bancoViewController.setAplicacion(this);
            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            //scene.getStylesheets().add(getClass().getResource("estilos.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}