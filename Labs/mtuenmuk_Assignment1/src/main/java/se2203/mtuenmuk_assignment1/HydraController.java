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

import java.util.Random;

public class HydraController {

    private Random rnd = new Random();

    @FXML
    private Button play, rest;

    @FXML
    private Slider headSize;

    @FXML
    private GridPane gameArea;

    private ImageView hydraIcon = new ImageView();

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
        this.gameArea.add(new Label("HI"), 1,0);
    }

    public void setHydraIcon(ImageView head, int headType){
        int x = this.rnd.nextInt(1,16);
        int y = this.rnd.nextInt(1,16);
        System.out.printf("%d,%d", x, y);
//        while (!(this.gameArea.getCellBounds(x,y).isEmpty())){
//            x = this.rnd.nextInt(0,16);
//            y = this.rnd.nextInt(0,16);
//        }
        this.gameArea.add(head, x,y);
        this.hydraIcon.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                Node mouseClick = mouseEvent.getPickResult().getIntersectedNode();
                clickHead(mouseClick);
            }
        });
    }

    public void clickHead(Node mouseClick){
        int row = GridPane.getRowIndex(mouseClick);
        int col = GridPane.getColumnIndex(mouseClick);

        System.out.printf("\n%d %d\n", row,col);

        
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