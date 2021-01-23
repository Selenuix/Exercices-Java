/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recherche.dichotomique;

/**
 *
 * @author ACISZEK1
 */
public class RechercheDichotomique {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Déclaration des variables
        int[] tab = {5,11,19,38,54,55,78,87,100,105};
        int place;
        
        place = dicho(78, tab);
        
        if(place == -1) {
            System.out.println("Nombre non trouvé !");
        } else {
            System.out.println("Le nombre se trouve à la place : " + place);
        }
    }
    
    public static int dicho(int nombre, int[] tableau) {
        // Déclaration des variables
        int d, f, m;
        boolean trouve;
        
        // Initialisation
        trouve = false;
        d = 0;
        f = 9;
                
        do {
            m = (int) ((d + f) / 2);
            if(tableau[m] == nombre) {
                trouve = true;
            } else {
                if(nombre < tableau[m]) {
                    f = m - 1;
                } else {
                    d = m + 1;
                }
            }
        }while(!trouve && d <= f);
        
        if(!trouve) {
            m = -1;
        }
        
        return(m);
    }

}
