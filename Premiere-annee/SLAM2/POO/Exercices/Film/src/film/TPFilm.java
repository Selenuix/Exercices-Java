/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package film;

/**
 *
 * @author Anthony
 */
public class TPFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Déclaration des objets
        Film unFilm;
        Acteur acteur1, acteur2, acteur3, acteur4, acteur5, acteur6, acteur7, acteur8,
            acteur9, acteur10, acteur11;
        
        // Instanciation du film
        unFilm = new Film("Intouchables", 2011, "Olivier Nakache");
        
        // Instanciation des acteurs
        acteur1 = new Acteur("Cluzet", "François");
        acteur2 = new Acteur("Sy", "Omar");
        acteur3 = new Acteur("Le Ny", "Anne");
        acteur4 = new Acteur("Fleurot", "Audrey");
        acteur5 = new Acteur("Mollet", "Clotilde");
        acteur6 = new Acteur("Gaia Bellugi", "Alba");
        acteur7 = new Acteur("Mendy", "Cyril");
        acteur8 = new Acteur("Kamate", "Salimata");
        
        acteur9 = new Acteur("Bouchefana", "Hédi");
        acteur10 = new Acteur("Baroche", "Benjamin");
        acteur11 = new Acteur("Latil", "Elliot");
        
        unFilm.ajouterJouer(acteur1, 1, "Philippe");
        unFilm.ajouterJouer(acteur2, 1, "Driss");
        unFilm.ajouterJouer(acteur3, 1, "Yvonne");
        unFilm.ajouterJouer(acteur4, 1, "Magalie");
        unFilm.ajouterJouer(acteur5, 1, "Marcelle");
        unFilm.ajouterJouer(acteur6, 1, "Elisa");
        unFilm.ajouterJouer(acteur7, 1, "Adama");
        unFilm.ajouterJouer(acteur8, 1, "Fatou");
        
        unFilm.ajouterJouer(acteur9, 2, "Garagiste");
        unFilm.ajouterJouer(acteur10, 2, "Policier");
        unFilm.ajouterJouer(acteur11, 2, "Lycéen");
        
        System.out.println(unFilm.toString()); 
    }
    
}
