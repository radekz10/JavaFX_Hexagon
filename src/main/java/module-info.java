module com.example.hexagon {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hexagon to javafx.fxml;
    exports com.example.hexagon;
}