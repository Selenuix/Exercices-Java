/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice8;
import sio.Saisir;

/**
 *
 * @author CISZEK
 */
public class Exercice8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Déclaration des constantes
        final float TAUX_CONVERSION = 6.55957f;
        
        // Déclaration des variables
        float montantEuro, montantFrancs;
        
        // Saisie
        System.out.print("Entrez le montant en Euros : ");
        montantEuro = Saisir.f();
        
        // Calculs
        montantFrancs = montantEuro * TAUX_CONVERSION;
        
        // Affichage
        System.out.print("Montant en francs : " + montantFrancs);
    }
    
}
