/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice42;

/**
 *
 * @author CISZEK
 */
public class Exercice42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        renseignements(1, "Tarre", "Maggy", 1998);
    }
    
    public static void renseignements(int civilite, String nom, String 
            prenom, int annee) {
        String titre;
        int age;
        
        // Initialisation
        titre = "";
        age = 0;
        
        // Choix de la civilité
        switch(civilite) {
            case 1:
                titre = "Mlle .";
                break;
            case 2:
                titre = "Mme.";
                break;
            case 3:
                titre = "M.";
                break;
            default:
                titre = "Non spécifié";
                break;
        }
        
        // Calcul de l'âge
        age = 2019 - annee;
        
        System.out.println(titre + nom + " " + prenom + " a " + age + " ans ");
    }
    
}
