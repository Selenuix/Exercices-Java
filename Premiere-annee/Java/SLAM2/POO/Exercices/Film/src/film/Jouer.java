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
public class Jouer
{
    // Déclaration des attributs
    private int rang;
    private String role;
    private Acteur lActeur;
    
    // Constructeur principal
    public Jouer(int rang, String role, Acteur lActeur)
    {
        this.rang = rang;
        this.role = role;
        this.lActeur = lActeur;
    }
    
    // Accesseurs
    public Acteur getLActeur()
    {
        return this.lActeur;
    }

    public int getRang() {
        return this.rang;
    }

    public String getRole() {
        return this.role;
    }
}
