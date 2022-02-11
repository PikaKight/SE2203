package se2203.mtuenmuk_assignment1;

import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.Random;

public class HydraController {

    private Random rnd = new Random();

    private int score;

    private int[][] positions = new int[16][16];

    private ImageView hydraIcon = new ImageView();

    @FXML
    private Button play, rest;

    @FXML
    private Slider headSize;

    @FXML
    private GridPane gameArea;

    public void reset() {
        this.gameArea.getChildren().clear();

        this.play.setDisable(false);
        this.headSize.setDisable(false);
    }

    public void play(){
        int headType = (int)this.headSize.getValue();
        setHead(headType);
        this.play.setDisable(true);
        this.headSize.setDisable(true);
    }

    public void setHydraIcon(ImageView head, int headType){
        int x = this.rnd.nextInt(1,16);
        int y = this.rnd.nextInt(1,16);

        //checks if the randomly generated position is occupied
        //If it is, then I will check generating a position till it finds one that is not occupied
        while (this.positions[y][x] == 1){
            x = this.rnd.nextInt(1,16);
            y = this.rnd.nextInt(1,16);
        }

        //adds the hydra head onto the game area at the randomly generated position
        this.gameArea.add(head, x,y);

        //Indicates that the position at y,x (row number and column number) is occupied
        this.positions[y][x] = 1;

        /**
         * This adds a function to the hydra head that will activate
         * when it is clicked
         */
        this.hydraIcon.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                Node mouseClick = mouseEvent.getPickResult().getIntersectedNode();
                clickHead(mouseClick, headType);
            }
        });
    }

    public void clickHead(Node mouseClick, int headType){
        int row = GridPane.getRowIndex(mouseClick);
        int col = GridPane.getColumnIndex(mouseClick);
        this.gameArea.getChildren().remove(mouseClick);
        this.positions[row][col] = 0;
        this.score += 1;
    }

    public void setHead(int headType){
        this.hydraIcon.setFitWidth(40);
        this.hydraIcon.setFitHeight(40);
        switch(headType){
            case 1:
                this.hydraIcon.setImage(new Image("file:src/main/resources/se2203/" +
                        "mtuenmuk_assignment1/Icons/HeadSize1.png"));
                break;
            case 2:
                this.hydraIcon.setImage(new Image("file:src/main/resources/se2203" +
                        "/mtuenmuk_assignment1/Icons/HeadSize2.png"));
                break;

            case 3:
                this.hydraIcon.setImage(new Image("file:src/main/resources/se2203/" +
                        "mtuenmuk_assignment1/Icons/HeadSize3.png"));
                break;

            case 4:
                this.hydraIcon.setImage(new Image("file:src/main/resources/se2203/" +
                        "mtuenmuk_assignment1/Icons/HeadSize4.png"));
                break;

            case 5:
                this.hydraIcon.setImage(new Image("file:src/main/resources/se2203/" +
                        "mtuenmuk_assignment1/Icons/HeadSize5.png"));
                break;

            case 6: this.hydraIcon.setImage(new Image("file:src/main/resources/se2203/" +
                    "mtuenmuk_assignment1/Icons/HeadSize6.png"));
        }

        setHydraIcon(this.hydraIcon, headType);


    }
}