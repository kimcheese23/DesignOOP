module com.chi.quizapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.chi.quizapp to javafx.fxml;
    exports com.chi.quizapp;
}
