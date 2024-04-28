package co.edu.uniquindio.proyecto.yamaha.proyecto_yamaha.viewController;

import co.edu.uniquindio.proyecto.yamaha.proyecto_yamaha.controller.EmpleadoController;
import co.edu.uniquindio.proyecto.yamaha.proyecto_yamaha.model.Dto.EmpleadoDto;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;


public class EmpleadoViewController {
    EmpleadoController empleadoControllerService;
    ObservableList<EmpleadoDto> listaEmpleadosDto = FXCollections.observableArrayList();

    @FXML
    private RadioButton ADMIN;

    @FXML
    private RadioButton VENDEDOR;

    @FXML
    private TextField empleadoCedula;

    @FXML
    private TextField empleadoCelular;

    @FXML
    private TextField empleadoEdad;

    @FXML
    private TextField empleadoEmail;

    @FXML
    private TextField empleadoNombre;

    @FXML
    private TableView<?> tablaEmpleados;

    @FXML
    private TableColumn<EmpleadoDto, String> tccedula;

    @FXML
    private TableColumn<?, ?> tccelular;

    @FXML
    private TableColumn<?, ?> tcedad;

    @FXML
    private TableColumn<?, ?> tcemail;

    @FXML
    private TableColumn<EmpleadoDto, String> tcnombre;

    @FXML
    private ToggleGroup tipos;

    @FXML
    void onCrearEmpleado(ActionEvent event) {

    }

    @FXML
    void initialize() {
        empleadoControllerService = new EmpleadoController();
        intiView();
    }

    private void intiView() {
        initDataBinding();
        obtenerEmpleados();
        tableEmpleados.getItems().clear();
        tableEmpleados.setItems(listaEmpleadosDto);
        listenerSelection();
    }

    private void initDataBinding() {

        tcnombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().nombre()));
        tccedula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().cedula()));

    }

}
