/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casmomi;

/**
 *
 * @author Anthony
 */
public class Entreprise
{
    // Déclaration des attributs
    private int id;
    private String nom;
    
    // Constructeur
    public Entreprise(int id, String nom)
    {
        this.id = id;
        this.nom = nom;
    }

    /*
        Acesseurs
        En lecture    
    */
    
    public String getNom() {
        return this.nom;
    }
}
