package Prototype.GUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import Prototype.Domain.Cable;
import Prototype.DataAccess.RegisterCableDAOKt;
import java.io.IOException;
import java.sql.SQLException;

public class RegisterCableController extends Application {

    @FXML
    private TextField estadoTextField;

    @FXML
    private TextField marcaTextField;

    @FXML
    private TextField claveTextField;

    @FXML
    private TextField adaptadorTextField;

    @FXML
    private TextArea descripcionTextArea;

    @FXML
    private Button saveButton;

    @FXML
    private Button cancelButton;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXML/RegisterCableFXML.fxml"));
        primaryStage.setTitle("Registrar dispositivo");
        primaryStage.setScene(new Scene(root, 300,500));
        primaryStage.show();
    }

    public void saveButtonEvent(ActionEvent event) throws SQLException, ClassNotFoundException, IOException{
        Cable cable = new Cable();
        cable.setEstado(estadoTextField.getText());
        cable.setMarca(marcaTextField.getText());
        cable.setClaveDispositivo(claveTextField.getText());
        cable.setAdaptador(adaptadorTextField.getText());
        cable.setDescripcion(descripcionTextArea.getText());
        int result = RegisterCableDAOKt.registerCable(cable);
        if (result == 1){
            showConfirmationAlert();
        }else{
            System.out.println("Error");
        }
    }

    public void cancelButtonEvent(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXML/ExitAlertFXML.fxml"));
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(cancelButton.getScene().getWindow());
        stage.showAndWait();
    }

    public void showConfirmationAlert() throws IOException{
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXML/SavedDeviceAlertFXML.fxml"));
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(saveButton.getScene().getWindow());
        stage.showAndWait();
    }

    public static void main(String [] args){
        launch(args);
    }
}
