module se2203b.exercise1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens se2203b.exercise1 to javafx.fxml;
    exports se2203b.exercise1;
}