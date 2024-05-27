package co.edu.uniquindio.proyecto.yamaha.proyecto_yamaha.viewController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

public class MantenimientoViewController {

    @FXML
    private TextArea DescripcionMantenimiento;

    @FXML
    private ToggleGroup EstadoMantenimiento;

    @FXML
    private RadioButton Pendiente;

    @FXML
    private RadioButton Terminado;

    @FXML
    private Button btnActualizarMantenimiento;

    @FXML
    private Button btnGuardarMantenimiento;

    @FXML
    private Button btnNuevoMantenimiento;

    @FXML
    private DatePicker fechaMantenimiento;

    @FXML
    private TableColumn<?, ?> tcDescripcion;

    @FXML
    private TableColumn<?, ?> tcEstado;

    @FXML
    private TableColumn<?, ?> tcFecha;

    @FXML
    void onActualizarMantenimiento(ActionEvent event) {

    }

    @FXML
    void onGuardarMantenimiento(ActionEvent event) {

    }

    @FXML
    void onNuevoMantenimiento(ActionEvent event) {

    }

}
