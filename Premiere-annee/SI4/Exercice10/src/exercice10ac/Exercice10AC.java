/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice10ac;
import sio.Saisir;

/**
 *
 * @author ELEVE
 */
public class Exercice10AC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Déclaration des variables et des constantes
        String nomFonctionnaire;
        float indice, salaireNet, salaireBrut;
        final float VALEUR_POINT_INDICE = 4.68f;
        
        // Saisie
        System.out.print("Nom du fonctionnaire : ");
        nomFonctionnaire = Saisir.S();
        System.out.print("Indice : ");
        indice = Saisir.f();
        
        // Calcul du salaire brut
        salaireBrut = indice * VALEUR_POINT_INDICE;
        
        // Calcul du salaire net
        salaireNet = salaireBrut * (1 - (18f / 100f));
        
        // Affichage
        System.out.println("Le salaire de M. " + nomFonctionnaire + " est de " +
                salaireNet + "€");
        
    }
    
}
