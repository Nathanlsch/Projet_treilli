/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.cours.projet_treilli.figure;

import java.awt.Color;
import recup.Lire;

/**
 *
 * @author francois
 */
public class Point  {

    private double px;
    private double py;

    public Point() {
        this.px=0;
        this.py=0;
    }

    public Point(double px, double py) {
        this.px=px;
        this.py=py;
     }

    public double getPx() {
        return this.px;
    }
    
     public double getPy() {
        return this.py;
    }

    public void setPx(double px) {
        this.px = px;
    }

    public double distance(Point p2) {
        double dx = this.px - p2.px;
        double dy = this.py - p2.py;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Point milieu(Point p2) {
        Point res;
        res = new Point();
        res.px = (this.px + p2.px) / 2;
        res.py = (this.py + p2.py) / 2;
        return res;
    }
    
        //Calculer le produit scalaire entre les vecteurs formés par a(PNoeud,P1), b(PNoeud,P2)
        public double ProduitScalaire (Point P1, Point P2) {
            //Calculer les coordonnées du vecteur a(PNoeud,P1)
            double ax = this.getPx()- P1.getPx();
            double ay = this.getPy()- P1.getPy();
            
            //Calculer les coordonnées du vecteur b(PNoeud,P2)
            double bx = this.getPx()- P2.getPx();
            double by = this.getPy()- P2.getPy();
            
            System.out.println(ax*by + ay*bx);
            //Calculer le produit scalaire a.b
            return ax*bx + ay*by;
            
        }
        
        //Détermine l'angle entre les vecteurs a(Noeud,P1) et b(Noeud,P2)
        public double getAngle(Point Point1, Point Point2) {
            
        double A = this.distance(Point1);
        double B = this.distance(Point2);
        
        System.out.println(A);
        System.out.println(B);
        
        
        return Math.acos(this.ProduitScalaire(Point1, Point2)/(A*B));
        
    }
        public double signe (Point P1, Point P2) {
            double pNx = this.getPx();
            double pNy = this.getPy();
            
            double p1x = P1.getPx();
            double p1y = P1.getPy();
            
            double p2x = P2.getPx();
            double p2y = P2.getPx();
           
            return (p1x - pNx) * (p2y - pNy) - (p2x - pNx) * (p1y - pNy);
        }
        
        public boolean PointDansTriangle (Point P1, Point P2, Point P3) {
            double d1, d2, d3;
            boolean neg, pos;
            
            d1 = this.signe(P1,P2);
            d2 = this.signe(P2,P3);
            d3 = this.signe(P3,P1);
            
            neg = (d1<0) || (d2<0) || (d3<0);
            pos = (d1>0) || (d2>0) || (d3>0);
            
            return !(neg && pos);
                       
        }


    public String toString() {
        return "{Point ; abs : " + this.px + " ; ord : " + this.py + "}" ;
    }

    public static void testDistance() {
        Point p1;
        Point point2, pp, mi;
        p1 = new Point(0, 0);
        point2 = new Point(1, 2);
        pp = new Point(1, 1);
        double dist = p1.distance(point2);
        double dist2 = pp.distance(p1);
        System.out.println("distance : " + dist);
        mi = p1.milieu(pp);
        System.out.println("milieu : " + mi);
    }

    public double minX() {
        return this.px;
    }
    
    public static void testConstructeur() {
        Point p1;
        Point p2,p3;
        p1 = new Point();
        p2 = new Point(1, 2);
        p3 = new Point(0, 0);
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
        System.out.println("p3 = " + p3);
    }

    public static void main(String[] args) {
//        testDistance();
testConstructeur();
    }
public static Point DemandePoint(){
    
    System.out.println("Donner l'abscisse");
    double abs = Lire.d();
    System.out.println("Donner l'ordonée");
    double ord = Lire.d();
    Point point = new Point(abs,ord);
    return point;
  
}

}
