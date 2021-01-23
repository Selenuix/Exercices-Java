/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorielle;
import sio.Saisir;

/**
 *
 * @author aciszek1
 */
public class Factorielle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Déclaration des variables
        int i = 1, nombre, resultat = 0;
        
        // Saisie
        System.out.print("Saisir nombre : ");
        nombre = Saisir.i();
        
        // Structure itérative
        while(i <= nombre) {            
	    i++;
            resultat = i * resultat;
            System.out.print(resultat);            
        }
        
        // Conditions
        if(nombre == 0) {
            resultat = 1;
        }
        
        // Affichage
        //System.out.println(resultat);
        
    }
    
}
