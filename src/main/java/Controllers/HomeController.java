package Controllers;

import home.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class HomeController extends BaseController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onRegistrarCalendarioButtonClick(ActionEvent event) throws IOException {
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        HelloApplication.calendario(stage);
    }

    @FXML
    private AnchorPane showPane;
    @FXML
    protected void onReporteDiarioButtonClick(ActionEvent event) throws IOException {
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        HelloApplication.reporteDiario(stage);
    }
    @FXML
    protected void onReporteMensualButtonClick(ActionEvent event) throws IOException {
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        HelloApplication.reporteMensual(stage);
    }
    @FXML
    protected void onRegistrarAsistenciaButtonClick(ActionEvent event) throws IOException {
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        HelloApplication.asistencia(stage);
    }
    @FXML
    protected void onRegistrarActividadesButtonClick(ActionEvent event) throws IOException {
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        HelloApplication.actividades(stage);
    }

    @FXML
    protected void onRegistrarConformidadButtonClick(ActionEvent event) throws IOException {
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        HelloApplication.conformidad(stage);
    }


    @FXML
    protected void onObtenerReporteMensualButtonClick(ActionEvent event) throws IOException {
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        HelloApplication.reporteMensual(stage);
    }

    @FXML
    protected void onBuscarTurnosButtonClick(ActionEvent event) throws IOException {
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        HelloApplication.buscador(stage);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}