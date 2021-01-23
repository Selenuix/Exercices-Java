/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice28;
import sio.Saisir;

/**
 *
 * @author aciszek1
 */
public class Exercice28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i = 1, somme = 0, nombre;
       
       System.out.print("Saisir nombre : ");
       nombre = Saisir.i();
       
        while (i <= nombre) { 
	    somme = somme + i;
	    i = i + 1;
        }
        System.out.println("Somme : " + somme);
    }
    
}
