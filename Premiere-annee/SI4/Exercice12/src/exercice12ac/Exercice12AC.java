/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice12ac;
import sio.Saisir;

/**
 *
 * @author ELEVE
 */
public class Exercice12AC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Déclaration des variables
        float rayon;
        double surface, volume;
        
        // Saisie
        System.out.print("Entrez le rayon : ");
        rayon = Saisir.f();
        
        // Calculs        
        surface = 4 * Math.pow(rayon, 2);
        volume = (4/3) * Math.PI * Math.pow(rayon, 3);
        
        // Affichage
        System.out.println("Surface : " + surface);
        System.out.println("Volume : " + volume);
    }
    
}
