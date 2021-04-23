/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import fr.insa.cours.projet_treilli.Terrain.Terrain;
import recup.Lire;

/**
 *
 * @author lasch
 */


public class main {
    
    
  public void menuTexte() {
        int rep = -1;
        while (rep != 0) {
            System.out.println("1) créer un terrain");
            System.out.println("2) ajouter un triangle terrain");
            System.out.println("3) ajouter un appui");
            System.out.println("4) afficher le rectangle englobant");
            System.out.println("0) quitter");
            System.out.println("votre choix : ");
            rep = Lire.i();
            if (rep == 1) {
               Terrain tr = new Terrain.TEST();
               
               
                
            } else if (rep == 2) {
                
                
            } else if (rep == 3) {
                
                
            } else if (rep == 4) {
                
                
            }
        }
    }  

    
    public static void main(String[] args) {
        
    }

