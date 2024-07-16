module com.mycompany.gestorventas {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.gestorventas to javafx.fxml;
    exports com.mycompany.gestorventas;
}
