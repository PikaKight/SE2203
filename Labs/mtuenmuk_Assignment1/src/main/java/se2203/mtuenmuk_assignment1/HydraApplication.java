package se2203.mtuenmuk_assignment1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HydraApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HydraApplication.class.getResource("Hydra-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hydra Game");
        stage.getIcons().add(new Image("file:src/main/resources/se2203/mtuenmuk_assignment1/Icons/HydraIcon.png"));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}