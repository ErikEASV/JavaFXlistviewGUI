package com.example.demo14;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

import java.util.Optional;

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

    // Eksempel på enkel modal dialog med to felter
    @FXML
    public void lukknap(ActionEvent e) {
        // Dialogen defineres med "ButtonTyes", hvilket betyder at vi kan bestemmer at
        // dialogen afsluttes med at vi tester på knapperne
        Dialog<ButtonType> dialog = new Dialog();

        // Her sættes vinduet op
        dialog.setTitle("Eksempel på dialog");
        dialog.setHeaderText("Her kan stå noget tekst");
        dialog.getDialogPane().getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);
        TextField felt1 = new TextField();
        TextField felt2 = new TextField();
        VBox box = new VBox(felt1, felt2);
        dialog.getDialogPane().setContent(box);

        // Her afsluttes dialogen med at man kan trykke på OK
        Optional<ButtonType> knap = dialog.showAndWait();
        // Derefter kan vi henter felternes indhold ud og gøre hvad der skal gøres...
        if (knap.get() == ButtonType.OK)
            System.out.println("Felt1 = " + felt1.getText() + " felt2 = " + felt2.getText());
    }

    public void initialize() {
        // Fyld noget i listen
        minListe.getItems().add("æble");
    }

}