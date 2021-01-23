/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice34;

/**
 *
 * @author CISZEK
 */
public class Exercice34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Déclaration des constantes et des variables
       int i;
       float total;
       
       // Initialisation
       total = 0;
       
       // Itération
       for(i = 1; i <= 99; i++) {
           total = total + (1 / (float) i);
       }
       
       System.out.println("La somme est de : " + total);
    }
    
}
