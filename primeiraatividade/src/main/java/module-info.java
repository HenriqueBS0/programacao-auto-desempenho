module com.henriquebs {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.henriquebs to javafx.fxml;
    exports com.henriquebs;
}
