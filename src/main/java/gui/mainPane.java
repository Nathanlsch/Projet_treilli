/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author lasch
 */
public class mainPane extends BorderPane {
    
    //Variable menu 
    private Button boutton1;
    private Menu menu;
    private MenuBar menuBar;
    private Menu subMenu;
    private MenuItem menuItem1;
    private MenuItem menuItem2;
    //Fin variable menu 
    
    //Variable Dessin
    private DessinCanvas cvtest;
    
    //Variable Bouton
    private Button test;
    
public mainPane(){ 
   
    //Création bouton
   test = new Button();
    
   //Création du menu 
   menuBar = new MenuBar();
   menu = new Menu("Menu 1");
   boutton1 = new Button("Boutton1");
   subMenu = new Menu("Menu1.1");
   menuItem1 = new MenuItem("Item 1.1.1");
   subMenu.getItems().add(menuItem1);
   menu.getItems().add(subMenu);
   
   menuItem2 = new MenuItem("Item 2");
   menu.getItems().add(menuItem2);
   
   menuBar.getMenus().add(menu);
   
   HBox Menu = new HBox(menuBar);
   this.setTop(Menu);
    
   //Fin du menu
   
   //Boite gauche
   VBox gauche = new VBox(test);
   gauche.setMaxSize(100, 200);
   gauche.setMinSize(100, 200);
   this.setLeft(gauche);
   //Bouton associé
   test = new Bouton("test",100,25);
   
   this.test.setOnAction(new EventHandler<ActionEvent>(){
       @Override
       public void handle(ActionEvent t){
           System.out.println("test");    
       }
       });
           

   
   //Debut dessin 
    this.cvtest = new DessinCanvas();
    this.setCenter(this.cvtest);
    
    this.cvtest.setOnMouseClicked((t) -> {
       System.out.println("click");
    });
   
  
}  
    
}
