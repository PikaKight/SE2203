package se2203b.exercise2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.util.Random;

public class SampleHandlerController{

    //Creates a private Label obj
    @FXML
    private Label jumpingLabel;

    /**
     * When an event is triggered, the label jumpingLabel will move to
     * a new location with a random x and y coordinate that is less than
     * 500 and 300 respectively
     */
    public void movingLabel(){
        Random randomPos = new Random();
        jumpingLabel.setLayoutX(randomPos.nextInt(500));
        jumpingLabel.setLayoutX(randomPos.nextInt(300));
    }

}