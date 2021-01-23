/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package td.compte;

import sio.Saisir;

/**
 *
 * @author ACISZEK1
 */
public class TDCompte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Déclaration des variables et des objets
        Compte Compte1;
        int choix;
        float montantSaisi;
        
        // Instanciation
        Compte1 = new Compte(768973001, "Queffélec");
        
        do {
            // Affichage du menu
            System.out.println("1- Créditer");
            System.out.println("2- Débiter");
            System.out.println("3- Etat du compte");
            System.out.println("4- Modifier le découvert bancaire");
            System.out.println("5- Quitter");
            
            // Choix de l'utilisateur
            System.out.print("Choix --> ");
            choix = Saisir.i();
            
            switch(choix) {
                // Créditer le compte
                case 1:
                    System.out.print("Saisir montant : ");
                    montantSaisi = Saisir.f();
                    Compte1.crediter(montantSaisi);
                    break;
                    // Débit du compte
                case 2:
                    // Saisie du montant
                    System.out.print("Saisir montant : ");
                    montantSaisi = Saisir.f();
                    
                    // Débit du compte
                    Compte1.debiter(montantSaisi);
                    
                    // Affichage des messages
                    if(Compte1.debiter(montantSaisi) == true) {
                        System.out.println("Le compte a bien été débité");
                    } else {
                        System.out.println("Une erreur est survenue");
                    }
                    break;
                // Etat du compte
                case 3:
                    System.out.println(Compte1.toString());
                    break;
                // Modification du découvert
                case 4:
                    System.out.print("Saisir montant : ");
                    montantSaisi = Saisir.f();
                    Compte1.setDecouvert(montantSaisi);
                    break;
                // Message par défaut
                default:
                    System.out.println("Choix non supporté !");
                    break;
            }
            
        } while(choix != 5);
    }

}
