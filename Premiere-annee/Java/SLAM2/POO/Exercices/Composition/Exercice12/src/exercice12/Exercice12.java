/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice12;

/**
 *
 * @author Anthony
 */
public class Exercice12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Déclaration des objets
        Auteur a1 = new Auteur(1, "Tardieu", "Hubert");
        Auteur a2 = new Auteur(2, "Rochfeld", "Arnold");
        Auteur a3 = new Auteur(3, "Coletti", "René");
        
        Livre l1 = new Livre("2-7081-1106-x", "La méthode Merise", "Tome 1 : Principes et outils");
        
        l1.ajouterAuteur(a1);
        l1.ajouterAuteur(a2);
        l1.ajouterAuteur(a3);
        
        l1.ajouterChapitre(1, "Introduction : contexte d'apparition de MERISE", 11);
        l1.ajouterChapitre(14, "Conclusion", 322);
        
        System.out.println(l1.toString());
    }
    
}
