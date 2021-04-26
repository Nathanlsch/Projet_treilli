/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author lasch
 */
public class mainPane extends BorderPane {
    
    private RadioButton rbtest1;
    private RadioButton rbtest2;
    private RadioButton rbtest3;
    private RadioButton rbtest4;
    private RadioButton rbtest5;
    private RadioButton rbtest6;
    private Menu menu1;

public mainPane(){ 
    
    this.rbtest1 =new RadioButton("test1");
    this.rbtest2 =new RadioButton("test2");
    this.rbtest3 =new RadioButton("test3");
    this.rbtest4 =new RadioButton("test4");
    this.rbtest5 =new RadioButton("test5");
    this.rbtest6 =new RadioButton("test6");
    this.menu1 = new Menu("File");
    
    MenuBar menuBar = new MenuBar();
    menuBar.getMenus().add(menu1);
    
    VBox gauche = new VBox(this.rbtest1,this.rbtest2);
    this.setLeft(gauche);
    //VBox droite = new VBox(this.rbtest3);
    //this.setRight(test);
    HBox haut = new HBox(this.rbtest4,this.rbtest5,this.rbtest6);
    this.setTop(haut);
    
    
}  
    
}
