/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.compte;

import sio.Saisir;

/**
 *
 * @author ACISZEK1
*/
public class Compte {
    // Définition des attributs
    private int numero;
    private String nom, motDePasse;
    private float decouvert, solde;
    
    // Constructeur
    public Compte(int n, String nomCompte, String m) {
        this.numero = n;
        this.nom = nomCompte;
        this.decouvert = 0;
        this.solde = 0;
        this.motDePasse = m;
    }
    
    // Constructeur alternatif
    public Compte(int n, String nomCompte) {
        this.numero = n;
        this.nom = nomCompte;        
        this.decouvert = 0;
        this.solde = 0;
        this.motDePasse = "0000";
    }
    
    /* 
    * Définition des accesseurs
    * En écriture
    */
    public void setDecouvert(float decouvert) {
        // Déclaration des variables
        String motDePasseSaisi;
        
        if(this.motDePasse.equals("0000")) {
            // Saisi du nouveau mot de passe
            System.out.print("Nouveau mot de passe : ");
            motDePasseSaisi = Saisir.S();
            
            // Changement du mot de passe
            this.motDePasse = motDePasseSaisi;
            
            // Affichage du message de succè
            System.out.println("Le mot de passe a bien été mis à jour");
        }
        
        // Changement du découvert
        this.decouvert = decouvert;
        
        // Affichage du message de succès
        System.out.println("Le découvert à bien été modifié");
    }
    
    // Créditer le compte
    public void crediter(float montant) {
        this.solde = this.solde + montant;
        System.out.println("Le compte à bien été crédité.");
    }
    
    // Débiter le compte
    public boolean debiter(float montant) {
        if(this.solde - montant > decouvert) {
            this.solde = this.solde - montant;
            return true;
        } else {
            return false;
        }
    }
    
    // Retourner les info en chaîne de caractères
    public String toString() {
        // Déclaration des variables
        String resultat;
        
        resultat = "-------------------------------------";
        resultat = resultat + "\nNuméro : " + this.numero;
        resultat = resultat + "\nNom du titulaire : " + this.nom;
        resultat = resultat + "\nDécouvert autorisé : " + this.decouvert + " €";
        resultat = resultat + "\nSolde actuel : " + this.solde + " €";
        resultat = resultat + "\n-------------------------------------";
        return resultat;
    }
}
