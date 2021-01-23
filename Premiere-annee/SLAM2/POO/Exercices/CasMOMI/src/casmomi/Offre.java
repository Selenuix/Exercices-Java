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
public class Offre
{
    // Déclaration des attributs
    private float prix;
    private int duree;
    private Entreprise lEntreprise;
    
    // Constructeur
    public Offre(float prix, int duree, Entreprise entreprise)
    {
        this.prix = prix;
        this.duree = duree;
        this.lEntreprise = entreprise;
    }

    /*
        Accesseurs
        En lecture
    */
    public int getDuree() {
        return this.duree;
    }

    public float getPrix() {
        return this.prix;
    }

    public Entreprise getlEntreprise() {
        return this.lEntreprise;
    }
}
