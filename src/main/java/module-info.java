module org.example.collectionframework {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.collectionframework to javafx.fxml;
    exports org.example.collectionframework;
}