/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.cours.projet_treilli.noeud;

import fr.insa.cours.projet_treilli.Terrain.TriangleTerrain;



/**
 *
 * @author Steven
 */
public class AppuiDouble extends Appui {

    public AppuiDouble(int id, TriangleTerrain triangleTerrain, int p1, double posSurSegment) {
        super(id, triangleTerrain, p1, posSurSegment);
    }

    @Override
    public String toString() {
        return "AppuiDouble;" + this.getId() + ";" + this.getTriangleTerrain().getIdTriangle() + ";" + this.getP1() + ";" + this.getPosSurSegment() + ";" ;
    }
    
    
    
    
}
