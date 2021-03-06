package Prototype.GUI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SavedDeviceAlertController extends Application{

    @FXML
    private Button okButton;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("FXML/SavedDeviceAlertFXML.fxml"));
        primaryStage.setTitle("Registro exitoso");
        primaryStage.setScene(new Scene(root, 500,200));
        primaryStage.show();
    }

    public void okButtonEvent(ActionEvent event){
        Stage stage = (Stage) okButton.getScene().getWindow();
        stage.close();
    }

    public static void main(String [] args){
        launch(args);
    }
}
