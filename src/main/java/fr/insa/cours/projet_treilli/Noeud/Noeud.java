/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.cours.projet_treilli.noeud;

import fr.insa.cours.projet_treilli.Terrain.TriangleTerrain;
import fr.insa.cours.projet_treilli.figure.Point;

/**
 *
 * @author Steven
 */
public class Noeud {
    
  private int id;
  private double px;
  
    public Noeud(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

}
