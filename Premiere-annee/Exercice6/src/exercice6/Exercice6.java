/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice6;

/**
 *
 * @author CISZEK
 */
public class Exercice6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Déclaration des constantes
        final float TAUX_TVA = 20.0f;
        
        // Déclaration des variables
        String nomProduit;
        float prixHt, totalHt, totalTtc;
        int quantite;
        
        // Initialisation
        nomProduit = "carte réseau";
        prixHt = 15.60f;
        quantite = 5;
        
        // Calculs
        totalHt = prixHt * quantite;
        totalTtc = totalHt * ((100 + TAUX_TVA) / 100);
        
        // Affichage du résultat
        System.out.println("Nom du produit : " + nomProduit);
        System.out.println("Prix HT unitaire : " + prixHt + "€");
        System.out.println("Quantité : " + quantite);
        System.out.println("Total HT : " + totalHt);
        System.out.println("Total TTC : " + totalTtc + "€");
    }
    
}
