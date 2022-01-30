module se2203b.exercise3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens se2203b.exercise3 to javafx.fxml;
    exports se2203b.exercise3;
}