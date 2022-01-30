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
        //creates a Random obj that will be used generate a random number
        Random randomPos = new Random();

        //using the Random obj to get a random int with a max value of 500 for the new X coordinate
        jumpingLabel.setLayoutX(randomPos.nextInt(500));

        //using the Random obj to get a random int with a max value of 300 for the new Y coordinate
        jumpingLabel.setLayoutY(randomPos.nextInt(300));
    }

}