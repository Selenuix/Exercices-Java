/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice12;

/**
 *
 * @author Anthony
 */
public class Auteur {
    private int id;
    private String nom;
    private String prenom;
    
    public Auteur(int id, String n, String p)
    {
        this.id = id;
        this.nom = n;
        this.prenom = p;
    }
    
    public String getNom()
    {
        return this.nom;
    }
    
    public String getPrenom()
    {
        return this.prenom;
    }
    
    
}
