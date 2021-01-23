/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice20;
import sio.Saisir;

/**
 *
 * @author ELEVE
 */
public class Exercice20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Déclaration des variables et des constantes
        final int PRIX_ESSENCE_JOUR = 23, PRIX_DIESEL_JOUR = 24;
        final float PLUS_VALUE_ESSENCE = 0.13f, PLUS_VALUE_DIESEL = 0.10f;
        int nbJours;
        float distance, gain, prixFormuleEssence, prixFormuleDiesel;
        
        // Saisie
        System.out.print("Saisir nombre de jours : ");
        nbJours = Saisir.i();
        System.out.print("Saisir distance : ");
        distance = Saisir.f();
        
        // Calcul prix formule essence
        prixFormuleEssence = (nbJours * PRIX_ESSENCE_JOUR) + (distance * 
                PLUS_VALUE_ESSENCE);
        
        // Calcul prix diesel
        prixFormuleDiesel = (nbJours * PRIX_DIESEL_JOUR) + (distance * 
                PLUS_VALUE_DIESEL);
        
        // Choix de la meilleur formule
        if(prixFormuleEssence < prixFormuleDiesel) {
            gain = prixFormuleDiesel - prixFormuleEssence;
            System.out.println("La meilleure formule est la formule Essence");
            System.out.println("Gain : " + gain + "€");
        } else {
            gain = prixFormuleEssence - prixFormuleDiesel;
            System.out.println("La meilleure formule est la formule Diesel");
            System.out.println("Gain : " + gain + "€");
        }
    }
}
