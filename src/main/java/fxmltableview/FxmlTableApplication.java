package fxmltableview;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FxmlTableApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("FXML TableView Example");
        Parent myPane = FXMLLoader.load(getClass().getResource("TableView.fxml"));
        Scene myScene = new Scene(myPane);
        stage.setScene(myScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}