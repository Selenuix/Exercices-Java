/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package td.client;

/**
 *
 * @author ACISZEK1
 */
public class TDClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Déclaration des variables
        Client Client1;
                
        // Instanciation
        Client1 = new Client("CLI1");
        
        // Affichage des infos
        System.out.println(Client1.toString());
        
        // Modification du nom
        Client1.setNom("Gradt");
        
        // Modification de la ville
        Client1.setVille("Colmar");
        
        // Modification du chiffre d'affaire
        Client1.cumulerCa(1500);
        
        // Affichage
        System.out.println(Client1.toString());
    }

}
