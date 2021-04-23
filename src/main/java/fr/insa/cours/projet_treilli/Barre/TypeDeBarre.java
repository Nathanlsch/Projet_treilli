/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.cours.projet_treilli.Barre;

/**
 *
 * @author celiajoy
 */
public class TypeDeBarre
{
    
    private double coutAuMetre;
    private double longueurMin;
    private double longueurMax;
    private double resistanceMaxCompression;
    
    public double getcoutAuMetre()
    {
        return this.coutAuMetre;
    }
    
    public double getlongueurMin()
    {
        return this.longueurMin;
    }
    
    public double getlongueurMax()
    {
        return this.longueurMax;
    }
    
    public double getresistanceMaxCompression()
    {
        return this.resistanceMaxCompression;
    }
    
    
    
    public void setcoutAuMetre(double coutAuMetre)
    {
        this.coutAuMetre = coutAuMetre;
    }
    
    public void setlongueurMin(double longueurMin)
    {
        this.longueurMin = longueurMin;
    }
    
    public void setlongueurMax(double longueurMax)
    {
        this.longueurMax = longueurMax;
    }
    
    public void resistanceMaxCompression(double resistanceMaxCompression)
    {
        this.resistanceMaxCompression = resistanceMaxCompression;
    } 
    
}
