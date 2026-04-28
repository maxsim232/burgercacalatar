module com.example.burgercacalatar {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.burgercacalatar to javafx.fxml;
    exports com.example.burgercacalatar;
}