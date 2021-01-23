/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice41;

/**
 *
 * @author CISZEK
 */
public class Exercice41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Déclaration des variables et des constantes
        afficherTemps(130);
    }
    
    public static void afficherTemps(int temps) {
        int heure, minute;
        String lesMinutes = "";
        heure = (int) (temps / 60);
        minute = temps % 60;
        
        if(minute < 10) {
            lesMinutes = "0" + minute;
        } else {
            lesMinutes = Integer.toString(minute);
        }
        System.out.println(heure + ":" + lesMinutes);
    }
    
}
