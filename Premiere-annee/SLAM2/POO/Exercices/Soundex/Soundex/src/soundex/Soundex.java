/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soundex;

/**
 *
 * @author Anthony
 */
public class Soundex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(soundex("Da Cobsta Tofrk", 'a'));
        
    }
    
    public static String soundex(String chaine, char langue) {
        // Déclaration des variables        
        String sousChaine;
        
        // Supression des espaces
        chaine = chaine.replaceAll("\\s+", "");
        
        // Mise en majuscule
        chaine = chaine.toUpperCase();
        
        // Stockage de la première lettre
        sousChaine = chaine.substring(0, 1);
        chaine = chaine.substring(1, chaine.length());
        
        // Suppression des lettres A, E, I, O, U, Y, H et W
        chaine = chaine.replaceAll("A", "");
        chaine = chaine.replaceAll("E", "");
        chaine = chaine.replaceAll("I", "");
        chaine = chaine.replaceAll("O", "");
        chaine = chaine.replaceAll("U", "");
        chaine = chaine.replaceAll("Y", "");
        chaine = chaine.replaceAll("H", "");
        chaine = chaine.replaceAll("W", "");
        
        // Remplacement des lettres
        nombre = "";
                
        return chaine;
    }
    
}
