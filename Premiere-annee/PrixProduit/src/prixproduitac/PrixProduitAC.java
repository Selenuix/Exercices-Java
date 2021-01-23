/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prixproduitac;
import sio.Saisir;
import java.text.DecimalFormat;

/**
 *
 * @author ELEVE
 */
public class PrixProduitAC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Déclaration des variables et constantes
        String nomProduit;
        float prixUnitaire;
        int quantite;
        float prixTotalHt, prixTotalTtc;
        final float TAUX_TVA = 20.0f;
        
        // Gérer l'arrondi et les 2 décimales
        DecimalFormat df = new DecimalFormat("#0.00");
        
        // Saisies
        System.out.println("--------------------------------------");
        System.out.print("Nom du produit : ");
        nomProduit = Saisir.S();
        
        System.out.print("Prix unitaire HT : ");
        prixUnitaire = Saisir.f();
        
        System.out.print("Quantité : ");
        quantite = Saisir.i();
        System.out.println("--------------------------------------");
        prixTotalHt = prixUnitaire * quantite;
        prixTotalTtc = prixTotalHt * (1 + TAUX_TVA / 100);
        
        // Affichage du résultat
        System.out.println("Produit : " + nomProduit);
        System.out.println(prixUnitaire + " x " + quantite + " = " + 
                df.format(prixTotalHt) + " € HT");
        System.out.println("--------------------------------------");
        System.out.println("\t => Prix total TTX = " + df.format(prixTotalTtc) +
                " € TTC");
        System.out.println("--------------------------------------");
    }
    
}
