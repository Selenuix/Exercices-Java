/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice7;

import sio.Saisir;
/**
 *
 * @author CISZEK
 */
public class Exercice7 {
    
    public static void main(String[] args) {
        // Déclaration des variables
        int a, b, c, somme;
        float moyenne;
        
        // Saisie
        System.out.print("Entrez le 1er nombre : ");
        a = Saisir.i();
        System.out.print("Entrez le 2ème nombre : ");
        b = Saisir.i();
        System.out.print("Entrez le 3ème nombre : ");
        c = Saisir.i();
        
        // Calculs
        somme = a + b + c;
        moyenne = somme / 3;
        System.out.println("Somme : " + somme);
        System.out.println("Moyenne : " + moyenne);
    }
    
}
