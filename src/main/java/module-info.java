module com.example.burgercalc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.burgercalc to javafx.fxml;
    exports com.example.burgercalc;
}