package gui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
/**
 *
 * @author lasch
 */
public class main extends Application {
    
    
    public static void main(String[] args) {
        launch();
       
    }
    
    

    @Override
    public void start(Stage stage) {
        Scene sc = new Scene(new mainPane(),800,600);
        stage.setScene(sc);
          stage.show();
    }
    

    

}
