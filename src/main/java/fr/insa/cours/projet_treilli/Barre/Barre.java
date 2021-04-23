/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.cours.projet_treilli.Barre;

import fr.insa.cours.projet_treilli.noeud.Noeud;

/**
 *
 * @author celiajoy
 */
public class Barre {
    
    private int id;
    private Noeud ndepart;
    private Noeud nfin;
    private TypeDeBarre typeDeBarre;

    public Barre(int id, Noeud ndepart, Noeud nfin, TypeDeBarre typeDeBarre) {
        this.id = id;
        this.nfin = nfin;
        this.typeDeBarre = typeDeBarre;
        
    }

    public int getId() {
        return id;
    }

    public Noeud getNdepart() {
        return ndepart;
    }

    public Noeud getNfin() {
        return nfin;
    }

    public TypeDeBarre getTypeDeBarre() {
        return typeDeBarre;
    }
    
        @Override
    public String toString() {
        return "Barre;" + this.getId() + ";" + this.getNdepart() + ";" + this.getNdepart() + ";" + this.getTypeDeBarre() + ";" ;
    }
    
   
    
}
