package br.com.hipcom.hello;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Paint;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Sou eeeeeeuuu");
        welcomeText.setTextFill(Paint.valueOf("green"));
    }
}