/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice22;
import sio.Saisir;

/**
 *
 * @author CISZEK
 */
public class Exercice22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Déclaration des variables
        int nb1, nb2, max, min, somme, choix;
        float moyenne;
        
        // Saisies
        System.out.print("Quel est le nombre 1 : ");
        nb1 = Saisir.i();
        System.out.print("Quel est le nombre 2 : ");
        nb2 = Saisir.i();
        
        // Affichage du menu
        System.out.println("1- Calculer la moyenne");
        System.out.println("2- Afficher le plus grand");
        System.out.println("3- Afficher le plus petit");
        System.out.println("4- Afficher la somme");
        System.out.print("->Choix : ");
        choix = Saisir.i();
        
        // Tests
        switch(choix) {
            case 1:
                // Calcul de la moyenne
                moyenne = (nb1 + nb2) / 2;
                System.out.print("La moyenne est : " + moyenne);
                break;
            case 2:
                // Détermination du plus grand
                if(nb1 == nb2) {
                    System.out.println("Les deux nombres sont égaux");
                } else {
                    if(nb1 > nb2) {
                        max = nb1;
                    } else {
                        max = nb2;
                    }
                System.out.println("Le plus grand est " + max);
                }
                break;
            case 3:
                // Détermination du plus petit
                if(nb1 == nb2) {
                    System.out.println("Les deux nombres sont égaux");
                } else {
                    if(nb1 < nb2) {
                        min = nb1;
                    } else {
                        min = nb2;
                    }
                System.out.println("Le plus grand est " + min);
                }
                break;
            case 4:
                // Calcul de la somme
                somme = nb1 + nb2;
                System.out.println("La somme est : " + somme);
                break;
            default:
                // Choix invalide
                System.out.println("Erreur de choix");
        }
    }
    
}
