/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.cours.projet_treilli.noeud;

/**
 *
 * @author Steven
 */
public class NoeudSimple extends Noeud {

      private double px;
      private double py; 
     
    public NoeudSimple (int id, double px, double py) {
    super(id);
    this.px = px;
    this.py = py;
    }
    
    public double getPx() {
        return px;
    }

    public double getPy() {
        return py;
    }

    public void setPx(double px) {
        this.px = px;
    }

    public void setPy(double py) {
        this.py = py;
    }

    @Override
    public String toString() {
        return "NoeudSimple;" + this.getId() + ";(" + this.getPx() + "," + this.getPy() + ')';
    } 
    
    
}
