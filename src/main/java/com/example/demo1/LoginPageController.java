package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginPageController {
    @FXML
    private Label UserLabel;
    @FXML
    TextField nameTextField;
    @FXML
    private Label passwordLabel;
    @FXML
    public TextField passwordTextField;

    @FXML
    private Button Home;
    @FXML
    private Button SignupButton;
    @FXML
    private Button loginButton;
    @FXML
    private Label welcomeLabel;
    @FXML
    private AnchorPane anchorPane;
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    protected void SignUpPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("SignUpPage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void Home(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void Dashboard(ActionEvent event) throws IOException {
        //Store text from the text field as string variables username and password
        String username = nameTextField.getText();
        String password = passwordTextField.getText();
        // Fxml loader instance
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LandingPage.fxml"));
        //set root =to loader and load it.
        root = loader.load();
        //root = FXMLLoader.load(getClass().getResource("LandingPage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}
