package se2203.mtuenmuk_assignment1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HydraController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}