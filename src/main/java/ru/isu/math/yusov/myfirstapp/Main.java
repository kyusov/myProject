package ru.isu.math.yusov.myfirstapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("views/main.fxml"));
        primaryStage.setTitle("ИС Строительная компания \"И так сойдет\"");
        primaryStage.setScene(new Scene(root, 385, 185));
        primaryStage.show();
    }
}
