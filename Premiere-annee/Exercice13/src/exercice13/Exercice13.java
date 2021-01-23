/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice13;
import sio.Saisir;

/**
 *
 * @author CISZEK
 */
public class Exercice13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Déclaration des variables et de constantes
        final int COEFFICIENT_E4 = 3, COEFFICIENT_E5 = 5, COEFFICIENT_E6 = 4;
        float moyenne, points, differenceE4, differenceE5, differenceE6, noteE4,
                noteE5, noteE6;
        
        // Saisies
        System.out.print("Note obtenue en E4 : ");
        noteE4 = Saisir.f();
        System.out.print("Note obtenue en E5 : ");
        noteE5 = Saisir.f();
        System.out.print("Note obtenue en E6 : ");
        noteE6 = Saisir.f();
        
        // Calculs
        
        points = (noteE4 * COEFFICIENT_E4) + (noteE5 * COEFFICIENT_E5) + 
                (noteE6 * COEFFICIENT_E6);
        moyenne = points / (COEFFICIENT_E4 + COEFFICIENT_E5 + COEFFICIENT_E6);
        // Gain ou perte de points
        //difference = 10 * COEFFICIENT_E4;
       
        // Affichage
        System.out.println("Moyenne : " + moyenne);
        System.out.println(points + " points rapportés");
        }
    }