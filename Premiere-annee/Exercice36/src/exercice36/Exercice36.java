/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice36;

import sio.Saisir;

/**
 *
 * @author CISZEK
 */
public class Exercice36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Déclaration des variables et des constantes
        char lettre;
        int frequence, nombreLettres;
        float taux;
        
        // Initialisation
        nombreLettres = 0;
        frequence = 0;
        
        do{
            System.out.print("Saisir charactère : ");
            lettre = Saisir.c();
            
            // Comptage du nombre de charactères
            nombreLettres = nombreLettres + 1;
            
            if(lettre == 'a') {
                frequence = frequence + 1;
            }
            
            // Calcul du taux
            taux = (frequence / nombreLettres) * 100;
        }while(lettre != '*');
        
        // Affichage
        System.out.println("Fréquence : " + frequence);
        System.out.println("Taux : " + taux + "%");
    }
    
}
