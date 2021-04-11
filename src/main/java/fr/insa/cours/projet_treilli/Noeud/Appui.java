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
public class Appui extends Noeud {
    
    private TriangleTerrain triangleTerrain; 
    private int p1;
    private double posSurSegment;

    public Appui(int id, TriangleTerrain triangleTerrain, int p1, double posSurSegment) {
        super(id);
        this.triangleTerrain = triangleTerrain;
        this.p1 = p1;
        this.posSurSegment = posSurSegment;
    }

    public TriangleTerrain getTriangleTerrain() {
        return triangleTerrain;
    }

    public int getP1() {
        return p1;
    }

    public double getPosSurSegment() {
        return posSurSegment;
    }
       
    
    
}
