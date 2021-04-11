/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.cours.projet_treilli.Terrain;

//import fr.insa.cours.projet_treilli.*;
import fr.insa.cours.projet_treilli.figure.Point;

/**
 *
 * @author lasch
 */
public class TriangleTerrain {
   
    private Point Point1;
    private Point Point2;
    private Point Point3;
    private SegmentTerrain Segment1;
    private SegmentTerrain Segment2;
    private SegmentTerrain Segment3;
    private int idTriangle;
 
    
    public TriangleTerrain (Point p1,Point p2, Point p3){
    this.Point1 = p1;
    this.Point2 = p2;
    this.Point3 = p3;
    this.Segment1 = new SegmentTerrain(p1, p2);
    this.Segment2 = new SegmentTerrain(p1, p3);
    this.Segment3 = new SegmentTerrain(p2, p3);
}

    public Point getPoint1() {
        return Point1;
    }

    public Point getPoint2() {
        return Point2;
    }

    public Point getPoint3() {
        return Point3;
    }

    public SegmentTerrain getSegment1() {
        return Segment1;
    }

    public SegmentTerrain getSegment2() {
        return Segment2;
    }

    public SegmentTerrain getSegment3() {
        return Segment3;
    }

    public int getIdTriangle() {
        return idTriangle;
    }

    @Override
    public String toString() {
        return "Triangle;("+Point1.getPx() + ";" + Point1.getPy() + ");(" +Point2.getPx() + ";" + Point2.getPy() + ");(" + +Point3.getPx() + ";" + Point3.getPy() + ")";
    }

   
    
    
    
    
    
    
}

