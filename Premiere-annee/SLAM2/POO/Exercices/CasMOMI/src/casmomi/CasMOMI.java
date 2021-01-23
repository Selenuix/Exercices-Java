/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casmomi;

/**
 *
 * @author Anthony
 */
public class CasMOMI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Déclaration des objets
        Projet projet1;
        Client client1;
        Offre offre1;
        Tranche tranche1, tranche2, tranche3, tranche4, tranche5, tranche6,
               tranche7, tranche8, tranche9, tranche10, tranche11, tranche12, 
                tranche13;
        Entreprise entreprise1, entreprise2, entreprise3, entreprise4, 
                entreprise5, entreprise6, entreprise7, entreprise8, entreprise9,
                entreprise10, entreprise11, entreprise12, entreprise13,
                entreprise14, entreprise15;
        
        // Création d'un client
        client1 = new Client(1, "Laurent De Wilde", "laurentdewilde@gmail.com", "07 84 53 54 71");
        
        // Création d'un projet
        projet1 = new Projet("2020-07", "Construction maison", "20/03/2020", client1);
        
        // Création des nouvelles tranches
        tranche1 = new Tranche("Terrassement – viabilisation", 2, false);
        tranche2 = new Tranche("Maçonnerie", 30, false);
        tranche3 = new Tranche("Charpente", 11, false);
        tranche4 = new Tranche("Couverture – zinguerie", 15, false);
        tranche5 = new Tranche("Menuiserie", 11, false);
        tranche6 = new Tranche("Plâtrerie – Faïences", 8, false);
        tranche7 = new Tranche("Isolation", 7, false);
        tranche8 = new Tranche("Carrelage", 10, false);
        tranche9 = new Tranche("Plomberie", 15, false);
        tranche10 = new Tranche("Chauffage", 5, false);
        tranche11 = new Tranche("Électricité", 10, false);
        tranche12 = new Tranche("Peintures", 7, true);
        tranche13 = new Tranche("Sols", 7, true);
        
        // Ajout des tranches au projet
        projet1.ajouterTranche(tranche1);
        projet1.ajouterTranche(tranche2);
        projet1.ajouterTranche(tranche3);
        projet1.ajouterTranche(tranche4);
        projet1.ajouterTranche(tranche5);
        projet1.ajouterTranche(tranche6);
        projet1.ajouterTranche(tranche7);
        projet1.ajouterTranche(tranche8);
        projet1.ajouterTranche(tranche9);
        projet1.ajouterTranche(tranche10);
        projet1.ajouterTranche(tranche11);
        projet1.ajouterTranche(tranche12);
        projet1.ajouterTranche(tranche13);
        
        // Créer les entreprises
        entreprise1 = new Entreprise(1, "SARL Balourd");
        entreprise2 = new Entreprise(2, "Ets Caplane");
        entreprise3 = new Entreprise(3, "SARL Elletrue");
        entreprise4 = new Entreprise(4, "SARL Duclou");
        entreprise5 = new Entreprise(5, "EURL Carpenter");
        entreprise6 = new Entreprise(6, "SARL Lagouttière");
        entreprise7 = new Entreprise(7, "Desplanches et Cies");
        entreprise8 = new Entreprise(8, "SARL Carabote ");
        entreprise9 = new Entreprise(9, "Ets Scions");
        entreprise10 = new Entreprise(10, "SARL Lachaud");
        entreprise11 = new Entreprise(11, "EURL Delacoupe");
        entreprise12 = new Entreprise(12, "Ets Cacouleplus");
        entreprise13 = new Entreprise(13, "SARL Vitaucho");
        entreprise14 = new Entreprise(14, "Ets Sakaï");
        entreprise15 = new Entreprise(15, "Ets Chataigne");
        
        // Liaison des entreprises et des offres        
        tranche1.ajouterOffre(426, 1, entreprise1);
        tranche1.ajouterOffre(527, 2, entreprise2);
        tranche2.ajouterOffre(17920, 30, entreprise3);
        tranche3.ajouterOffre(8848, 10, entreprise4);
        tranche3.ajouterOffre(7964, 12, entreprise5);
        tranche4.ajouterOffre(5478, 15, entreprise6);
        tranche5.ajouterOffre(4179, 12, entreprise7);
        tranche5.ajouterOffre(5122, 10, entreprise8);
        tranche5.ajouterOffre(4999, 11, entreprise9);
        tranche6.ajouterOffre(5839, 8, entreprise10);
        tranche7.ajouterOffre(5647, 3, entreprise11);
        tranche8.ajouterOffre(2532, 10, entreprise12);
        tranche9.ajouterOffre(5657, 14, entreprise13);
        tranche10.ajouterOffre(2639, 4, entreprise14);
        tranche11.ajouterOffre(6214, 10, entreprise15);
        tranche12.ajouterOffre(0, 14, null);
        tranche13.ajouterOffre(0, 8, null);
        
        
        // Affichage du devis le plus rapide
        System.out.println(projet1.devisLePlusRapide());
    }
}
