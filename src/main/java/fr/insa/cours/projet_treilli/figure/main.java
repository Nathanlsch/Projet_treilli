/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.cours.projet_treilli.figure;

/**
 *
 * @author Steven
 */
public class main extends Point {
    
    public static void main(String[] args) {
      Point point1 = new Point(-1,1);
      Point point2 = new Point(-10,2);
      Point Noeud = new Point (5,-10);
      
      System.out.println("Angle:");
      System.out.println(Noeud.getAngle(point1, point2));
        
    }
    
}

