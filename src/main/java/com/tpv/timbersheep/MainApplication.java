package com.tpv.timbersheep;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Ensure the path is correctly pointed to the FXML file
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("/com/tpv/timbersheep/views/main/main-view.fxml"));

        // Load the scene
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        // Remove window decorations
        stage.initStyle(StageStyle.UNDECORATED);

        // Set the title (optional, as there's no title bar in an undecorated window)
        stage.setTitle("Hello!");

        // Set the scene on the stage
        stage.setScene(scene);

        // Show the stage
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
