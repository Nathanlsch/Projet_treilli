package gui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
/**
 *
 * @author lasch
 */
public class main extends Application {

    @Override
    public void start(Stage stage) {
        Scene sc = new Scene(new mainPane());
        stage.setScene(sc);
          stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
