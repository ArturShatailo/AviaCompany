module com.example.aviacompany {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.aviacompany to javafx.fxml;
    exports com.example.aviacompany;
}