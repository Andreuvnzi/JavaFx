module com.mycompany.clase {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.clase to javafx.fxml;
    exports com.mycompany.clase;
}
