module com.example.recipebrowser {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.recipebrowser to javafx.fxml;
    exports com.example.recipebrowser;
}