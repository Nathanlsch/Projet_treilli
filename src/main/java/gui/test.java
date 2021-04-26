/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

/**
 *
 * @author lasch
 */
public class test extends BorderPane {
    
    private Button boutton1;
    private Menu menu;
    private MenuBar menuBar;
    private Menu subMenu;
    private MenuItem menuItem1;
    private MenuItem menuItem2;

public test(){
    
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

}
}
