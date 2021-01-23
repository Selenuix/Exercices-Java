/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package film;

/**
 *
 * @author Anthony
 */
public class Acteur
{
    // Déclaration des attributs
    private String nom;
    private String prenom;
    
    // Constructeur principal*
    public Acteur(String nom, String prenom)
    {
        this.nom = nom;
        this.prenom = prenom;
    }
    
    // Accesseurs en lecture

    public String getNom() {
        return this.nom;
    }

    public String getPrenom() {
        return this.prenom;
    }
}
