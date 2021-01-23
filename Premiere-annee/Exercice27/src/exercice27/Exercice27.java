/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice27;
import sio.Saisir;

/**
 *
 * @author aciszek1
 */
public class Exercice27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int table, nombre, resultat;
        
        System.out.print("Saisir la table à afficher : ");
        table = Saisir.i();
        
        nombre = 0;
        while(nombre <= 10) {
            resultat = nombre * table;
            System.out.println(nombre + "x" + table + " = " + resultat);
            nombre++;
        }
    }
    
}
