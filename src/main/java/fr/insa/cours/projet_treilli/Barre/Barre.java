/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.cours.projet_treilli.Barre;
package fr.insa.cours.projet_treilli.Noeud;

/**
 *
 * @author celiajoy
 */
public class Barre {
    
    private int id;
    private Noeud ndepart;
    private Noeud nfin; 


    public Barre(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
    
}