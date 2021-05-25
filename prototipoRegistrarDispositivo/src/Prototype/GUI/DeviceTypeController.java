package Prototype.GUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class DeviceTypeController extends Application{

    @FXML
    private Button laptopButton;

    @FXML
    private Button cannonButton;

    @FXML
    private Button controlButton;

    @FXML
    private Button cableButton;

    @FXML
    private Button cancelButton;

    @FXML
    private Button adaptadorButton;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("FXML/DeviceTypeFXML.fxml"));
        primaryStage.setTitle("Tipo de dispositivo");
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

    public void laptopButtonEvent(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXML/RegisterLaptopFXML.fxml"));
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(laptopButton.getScene().getWindow());
        stage.showAndWait();
    }

    public void cannonButtonEvent(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXML/RegisterProyectorFXML.fxml"));
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(cannonButton.getScene().getWindow());
        stage.showAndWait();
    }

    public void controlButtonEvent(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXML/RegisterControlFXML.fxml"));
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(controlButton.getScene().getWindow());
        stage.showAndWait();
    }

    public void cableButtonEvent(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXML/RegisterCableFXML.fxml"));
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(cableButton.getScene().getWindow());
        stage.showAndWait();
    }

    public void adaptadorButtonEvent(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXML/RegisterAdaptadorFXML.fxml"));
        stage.setScene(new Scene(root));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.initOwner(adaptadorButton.getScene().getWindow());
        stage.showAndWait();
    }

    public static void main(String [] args){
        launch(args);
    }
}
