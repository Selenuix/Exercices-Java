/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testarticle;

/**
 *
 * @author ACISZEK1
 */
public class TestArticle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Déclaration de la variable objet
        Article unArticle;
        
        // Instanciation
        unArticle = new Article("CBMXE", "Casque BMX enfant", 35.00f, 29.90f, 3);
        
        // Affichage de la valeur du stock en appelant la méthode valeurStock
        //System.out.println("La valeur du stock est de " + unArticle.valeurStock() + "€");
        
        
        // Affichage des informations
        System.out.println(unArticle.toString());
        System.out.println("---------------------");
        
        /*System.out.println(unArticle.getLibelle());
        System.out.println(unArticle.getPrixVente());
        System.out.print(unArticle.getPrixAchat());*/
        
        // Ajout du stock après livraison
        unArticle.stocker(10);
        
        // Affichage des informations après livraison
        System.out.println(unArticle.toString());
    }

}
