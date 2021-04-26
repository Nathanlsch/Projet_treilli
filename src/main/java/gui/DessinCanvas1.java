/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javafx.scene.paint.Color;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author lasch
 */
public class DessinCanvas1 extends Canvas {
    
    public DessinCanvas1(double w, double h){
    super(w,h);
    GraphicsContext context = this.getGraphicsContext2D();
    context.setFill(Color.RED);
    context.fillRect(0,0, this.getWidth(), this.getHeight());
    
    }
    
}
