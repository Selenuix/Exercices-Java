/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice26;

/**
 *
 * @author aciszek1
 */
public class Exercice26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 50;
        while(i >= 0) {
            if(i % 3 == 0) {
                System.out.print(i + " ");
            }
            i--;
        }
    }
    
}
