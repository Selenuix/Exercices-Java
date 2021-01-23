/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarticle;

/**
 *
 * @author ACISZEK1
 */
public class Article {
    // Attributs privés
    private String ref;
    private String libelle;
    private String resultat;
    private float prixAchat;
    private float prixVente;
    private int stock;
    
    // Constructeur
    public Article(String r, String l, float pa, float pv, int s) {
        this.ref = r;
        this.libelle = l;
        this.prixAchat = pa;
        this.prixVente = pv;
        this.stock = s;
    }
    
    // Méthode publique
    public float valeurStock() {
        return this.prixVente * this.stock;
    }
    
    /*
    * Retourne la marge sur un produit
    * @return float
    */
    private float marge() {
        return this.prixVente - this.prixAchat;
    }
    
    /*
    * Retourne les informations sur le produit
    * @return String resultat
    */
    public String toString() {
        /*resultat = "Référence : " + this.ref + "\nLibellé : " + 
                this.libelle + "\nPrix de vente : " + this.prixVente 
                + "\nPrix d'achat : " + this.prixAchat + "" + "\t(Marge : " +
                this.marge() + "€)" + "\nStock : " + this.stock +
                "\t(Valeur du stock : " + this.valeurStock() + "€)";*/
        resultat = "Référence : " + this.ref + "\nLibellé : " + 
                this.libelle + "\nPrix de vente : " + this.prixVente 
                + "\nPrix d'achat : " + this.prixAchat + 
                "\nStock : " + this.stock;
        return resultat;
    }
    
    // Accesseurs
    // ref : en lecture
    public String getRef() {
        return this.ref;
    }
    
    // libelle : en lecture
    public String getLibelle() {
        return this.libelle;
    }
    
    // prixVente en lecture
    public float getPrixVente() {
        return this.prixVente;
    }
    
    // stock en lecture
    public float getStock() {
        return this.stock;
    }
    
    // En écriture
    public void setStock(int s) {
        this.stock = s;
    }
    
}
