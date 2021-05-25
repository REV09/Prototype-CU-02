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
import Prototype.DataAccess.RegisterAdaptadorDAOKt;
import Prototype.Domain.Dispositivo;
import java.io.IOException;
import java.sql.SQLException;

public class RegisterAdaptadorController extends Application {

    @FXML
    private TextField marcaTextField;

    @FXML
    private TextField estadoTextField;

    @FXML
    private TextField claveTextField;

    @FXML
    private TextArea descripcionTextArea;

    @FXML
    private Button cancelButton;

    @FXML
    private Button saveButton;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("FXML/RegisterAdaptadorFXML.fxml"));
        primaryStage.setTitle("Registrar dispositivo");
        primaryStage.setScene(new Scene(root, 300,500));
        primaryStage.show();
    }

    public void saveButtonEvent(ActionEvent event) throws SQLException, ClassNotFoundException, IOException{
        Dispositivo adaptador = new Dispositivo();
        adaptador.setMarca(marcaTextField.getText());
        adaptador.setEstado(estadoTextField.getText());
        adaptador.setClaveDispositivo(claveTextField.getText());
        adaptador.setDescripcion(descripcionTextArea.getText());
        int result = RegisterAdaptadorDAOKt.registerAdaptador(adaptador);
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
