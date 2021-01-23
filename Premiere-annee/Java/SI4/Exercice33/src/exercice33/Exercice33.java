/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice33;

import sio.Saisir;
/**
 *
 * @author CISZEK
 */
public class Exercice33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Déclaration des constantes et des variables
        int a, b;
        double res;
        
        for(a = 1; a <= 100; a++) {
            for(b = 1; b <= 100; b++) {
                res = Math.pow(a, 2) + Math.pow(b, 2);
                if((int)Math.sqrt(res) == Math.sqrt(res)) {
                    System.out.println(a + " et " + b + " sont des carrés"
                            + " parfaits !");
                }
            }
        }
    }
    
}
