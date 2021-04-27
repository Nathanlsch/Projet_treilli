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
      Point point1 = new Point(-2,1);
      Point point2 = new Point(2,1);
      Point point3 = new Point(0,-2);
      Point Noeud = new Point (0,0);
      
      System.out.println("Dans triangle:");
      System.out.println(Noeud.PointDansTriangle(point1,point2,point3));
        
    }
    
}

