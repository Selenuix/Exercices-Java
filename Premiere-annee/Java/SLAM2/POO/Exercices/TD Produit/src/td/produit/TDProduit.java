/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package td.produit;

/**
 *
 * @author ACISZEK1
 */
public class TDProduit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Déclaration des objets
        Produit v1, v2;
        
        // Instanciation des objets
        v1 = new Produit("VTT", 500, 4);
        v2 = new Produit("BMX");
        
        // Stockage des BMX
        v2.stocker(5, 320);
        
        // Stockage des VTT
        v1.stocker(8, 460);
        
        if(v1.destocker(1)) {
            System.out.println("Destockage okay !");
        } else {
            System.out.println("Erreur lors du destockage !");
        }
        
        // Affichage valeur du stock VTT
        System.out.println("Valeur du stock : " + v1.valeurDuStock() + " €");
    }

}
