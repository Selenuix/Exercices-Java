/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.produit;

/**
 *
 * @author ACISZEK1
 */
public class Produit {
    // Définition des attributs
    private String nom;
    private double prix;
    private int stock;
    
    // Déclaration du constructeur principal
    public Produit(String n) {
        this.nom = n;
        this.prix = 0;
        this.stock = 0;
    }
    
    // Déclaration du constructeur secondaire
    public Produit(String n, double p, int s) {
        this.nom = n;
        this.prix = p;
        this.stock = s;
    }
    
    // Destocker un produit
    public boolean destocker(int quantite) {
        if(this.stock >= quantite && this.stock > 0) {
            this.stock = this.stock - quantite;
            return true;
        } else {
            return false;
        }
    }
    
    // Stockage d'un produit
    public void stocker(int quantite, double nouveauPrix) {
        // Déclaration des variables
        int ancienStock;
        double ancienPrix;
        
        // Stockage des anciennes valeurs
        ancienStock = this.stock;
        ancienPrix = this.prix;
        
        // Récupération du nouveau stock
        this.stock = this.stock + quantite;
        
        // Calcul du CMUP
        this.prix = ((ancienStock * ancienPrix) + quantite * nouveauPrix) / (ancienStock + quantite);
    }
    
    // Renvoi de la valeur du stock
    public double valeurDuStock() {
        return this.stock * this.prix;
    }
    
    // Accesseur en lecture
    public double getPrix() {
        return this.prix;
    }
}
