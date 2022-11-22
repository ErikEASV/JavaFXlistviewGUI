package com.example.demo14;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

public class HelloController {

    @FXML
    private ListView minListe = new ListView();

    @FXML
    private Label welcomeText;

    // Når man trykker i listviewet tilføjes et element med "pære"
    @FXML
    void klikPålinie(MouseEvent event) {
        minListe.getItems().add("pære");
        System.out.println("klik");
    }

    // Når man trykker på knappen fjernes alle elementer
    @FXML
    void onHelloButtonClick(ActionEvent event) {
        minListe.getItems().clear();
    }

    public void initialize() {
        // Fyld noget i listen
        minListe.getItems().add("æble");
    }

}