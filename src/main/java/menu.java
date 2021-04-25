/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import static fr.insa.cours.projet_treilli.Terrain.Terrain.DemandeTerrain;
import static fr.insa.cours.projet_treilli.Terrain.TriangleTerrain.DemandeTriangle;
import recup.Lire;

/**
 *
 * @author lasch
 */


public class menu {
    
    
  public static void menuTexte() {
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
              
                DemandeTerrain();
                 
            } else if (rep == 2) {
                
                DemandeTriangle();
                
            } else if (rep == 3) {
                
                
            } else if (rep == 4) {
                
                
            }
        }
    }  

    
    public static void main(String[] args) {
        menuTexte();
    }
}

