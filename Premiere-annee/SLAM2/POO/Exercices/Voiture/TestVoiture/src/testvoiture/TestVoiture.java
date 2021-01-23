/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testvoiture;

import sio.Voiture;

/**
 *
 * @author ACISZEK1
 */
public class TestVoiture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Déclaration des variables
        Voiture v1;
        Voiture v2;
        
        // Création de la voiture v1
        v1 = new Voiture("Titine");
        
        // Création de la voiture v2
        v2 = new Voiture("ma4L", 4);
        
        // Utilisation
        v2.demarrer();
        
        v2.passerMarcheArriere();
        v2.passerAuPointMort();
        v2.passerVitesseSup();
        
        v2.afficherEtat();
    }
    
}
