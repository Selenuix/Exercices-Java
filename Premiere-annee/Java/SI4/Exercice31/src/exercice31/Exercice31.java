/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice31;

import sio.Saisir;

/**
 *
 * @author CISZEK
 */
public class Exercice31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Déclaration des variables
        int nombreEtudiants, i;
        float note1, note2, note3, moyenneEleve, MoyenneClasse = 0, total = 0;
        
        // Saisie 
        System.out.print("Nombre d'élèves : ");
        nombreEtudiants = Saisir.i();
        
        // Itération
        for(i = 1; i <= nombreEtudiants; i++) {
            System.out.print("Saisir la première note : ");
            note1 = Saisir.f();
            System.out.print("Saisir la deuxième note : ");
            note2 = Saisir.f();
            System.out.print("Saisir la troisième note : ");
            note3 = Saisir.f();
            
            // Calculs
            moyenneEleve = (note1 + note2 + note3) / 3;
            total = moyenneEleve + total;
            MoyenneClasse = total / nombreEtudiants;
            
            // Affichage
            System.out.println("Moyenne de l'élève : " + moyenneEleve);
        }
        
        // Affichage moyenne de la classe
        System.out.println("Moyenne de la classe : " + MoyenneClasse);
    }
    
}
