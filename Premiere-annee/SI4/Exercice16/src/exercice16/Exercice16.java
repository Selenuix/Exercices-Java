/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice16;
import sio.Saisir;

/**
 *
 * @author ELEVE
 */
public class Exercice16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Déclaration des variables
        float note1, note2, moyenne;
        
        // Saisie des notes
        System.out.print("Saisir note 1 : ");
        note1 = Saisir.f();
        System.out.print("Saisir note 2 : ");
        note2 = Saisir.f();
        
        // Calcul de la moyenne
        moyenne = (note1 + note2) / 2;
        
        // Affichage du résultat
        if(moyenne >= 15) {
            System.out.print("C'est bien !");
        }
        else{
            if(moyenne < 10) {
                System.out.print("C'est insuffisant !");
            }
            else {
                System.out.print("C'est correct !");
            }   
        }
    }
    
}
