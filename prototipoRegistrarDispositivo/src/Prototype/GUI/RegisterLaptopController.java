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
import Prototype.Domain.Laptop;
import Prototype.DataAccess.RegisterLaptopDAOKt;

import java.io.IOException;
import java.sql.SQLException;

public class RegisterLaptopController extends Application{

    @FXML
    private TextArea descripcionTextArea;

    @FXML
    private TextField claveTextField;

    @FXML
    private TextField procesadorTextField;

    @FXML
    private TextField capacidadTextField;

    @FXML
    private TextField estadoTextField;

    @FXML
    private TextField marcaTextField;

    @FXML
    private Button saveButton;

    @FXML
    private Button cancelButton;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("FXML/RegisterLaptopFXML.fxml"));
        primaryStage.setTitle("Registrar dispositivo");
        primaryStage.setScene(new Scene(root, 300,600));
        primaryStage.show();
    }

    public void cancelButtonEvent(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXML/ExitAlertFXML.fxml"));
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(cancelButton.getScene().getWindow());
        stage.showAndWait();
    }
    public void saveButtonEvent(ActionEvent event) throws SQLException, ClassNotFoundException, IOException {
        Laptop laptop = new Laptop();
        laptop.setMarca(marcaTextField.getText());
        laptop.setEstado(estadoTextField.getText());
        laptop.setClaveDispositivo(claveTextField.getText());
        laptop.setProcesador(procesadorTextField.getText());
        laptop.setCapacidad(capacidadTextField.getText());
        laptop.setDescripcion(descripcionTextArea.getText());
        int result = RegisterLaptopDAOKt.registerLaptop(laptop);
        if (result == 1){
            showConfirmationAlert();
        }else{
            System.out.println("Error");
        }
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
