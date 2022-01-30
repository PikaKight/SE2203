package se2203b.exercise3;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.net.URL;
import java.util.ResourceBundle;


public class BeautifulFlowersController implements Initializable {

    //Creates private Label objs for each available flower to be used to add the flower's description on the GUI
    @FXML
    private Label roseLbl, callaLilyLbl, cannaLbl, bleedingHeartLbl,
            cherryBlossomLbl;

    //Creates private ImageView objs for each available flower to be used to add the flower image on the GUI
    @FXML
    private ImageView roseImage, callaLilyImage, cannaImage, bleedingHeartImage,
            cherryBlossomImage;

    //Creates a private TabPane obj to be used to manipulate the tab the user is on
    @FXML
    private TabPane beautifulFlowersTab;

    /**
     * Used to add each flower's image and description on the GUI using the builtin methods
     * for Image, ImageView and Label when the program starts running
     * It initializes all the images and text so the GUI has content
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        //setText() allows you to set the Label's text and the text is the flower's description
        roseLbl.setText("This beautiful flower and symbol of love belongs the genus Rosa." +
                " The family name of this flower is Rosaceae and it" +
                " contains different other species in almost all parts of the world." +
                " flower of rose vary in size from each other depending upon the species to which they belong." +
                " A large number of species of this flower are found in different parts of Asia.");

        callaLilyLbl.setText("One simple and common name of this beautiful flower is arum lily and this flowering plant"
                + " belongs to the family known as Araceae. This flowering plant is grown well in areas which have"
                + " reasonable rainfall and moderate temperatures..");

        cannaLbl.setText("This beautiful flowering plant belongs to a genus that contain around"
                + " 10 species and its family is known as Cannaceae." +
                " This flower plant also provides large quantity of starch which is "
                + "further used for different purposes. This flower is mostly found in tropical regions of the world."
                + " The flowers of this plant have three sepals and three petals.");

        bleedingHeartLbl.setText("The bleeding heart flower belongs to the family known as Papaveraceae. "
                + "This heart shaped flower is famous all over the world due to its unique beauty "
                + "and is found in great numbers in Siberia and China. "
                + "Blooming season of this flower starts in spring when there spread beautiful " +
                "pink heart-shaped flowers in gardens. Lady-in-a-bath is also a common name of this flower.");

        cherryBlossomLbl.setText("Cherry blossom, a beautiful flowering plant is found in different parts of the world "
                + "including the Northern Hemisphere. It is found in those areas which have moderate climate. "
                + "All species of this flowering plant do not produce cherries as there are "
                + "special species of this flower that produce edible cherries.");

        /*
         * getClass().getResource("path to image").toString() allows for the path to the image to be
         * set in the new Image obj
         * setImage(Image obj) takes in an Image obj with the image path and sets the image to it
         * so that it can be displayed
         */
        Image rose = new Image(getClass().getResource("Rose.gif").toString());
        roseImage.setImage(rose);

        Image callaLily = new Image(getClass().getResource("Calla Lily.gif").toString());
        callaLilyImage.setImage(callaLily);

        Image canna = new Image(getClass().getResource("Canna.gif").toString());
        cannaImage.setImage(canna);

        Image bleedingHeart = new Image(getClass().getResource("Bleeding Heart.gif").toString());
        bleedingHeartImage.setImage(bleedingHeart);

        Image cherryBlossom = new Image(getClass().getResource("Cherry Blossom.gif").toString());
        cherryBlossomImage.setImage(cherryBlossom);
    }

    /**
     * When an event is triggered, the window will go to the closest tab left of the current tab (the previous tab)
     */
    public void previous(){
        /*
        Uses the builtin TabPane obj methods to select the previous tab
        getSelectionModel() returns the current tab's state
        selectPrevious() uses the current tab's state to find and select the previous tab's state
         */
        beautifulFlowersTab.getSelectionModel().selectPrevious();
    }

    /**
     * When an event is triggered, the window will go to the closest tab right of the current tab (the next tab)
     */
    public void next(){
        /*
        Uses the builtin TabPane obj methods to select the previous tab
        getSelectionModel() returns the current tab's state
        selectNext() uses the current tab's state to find and select the next tab's state
         */
        beautifulFlowersTab.getSelectionModel().selectNext();
    }
}