/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice21;
import sio.Saisir;

/**
 *
 * @author ELEVE
 */
public class Exercice21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Définition des variables et des contantes
        float montantPort, prixUnitaire, prixTotal;
        int quantiteBouteille;
        
        // Saisie
        System.out.print("Quantité de bouteilles : ");
        quantiteBouteille = Saisir.i();
        System.out.print("Prix unitaire : ");
        prixUnitaire = Saisir.f();
        
        // Calculs
        prixTotal = quantiteBouteille * prixUnitaire;
        
        // Conditions
        if(prixTotal >= 150) {
            System.out.println("Frais de port gratuits");
        } else {
            montantPort = (prixTotal * 15) / 100;
            if (montantPort < 15) {
                montantPort = 15;
            }
            prixTotal = prixTotal + montantPort;
            System.out.println("Le prix total est de : " + prixTotal);
            System.out.println("Frais de port : " + montantPort);
        }
    }
    
}
