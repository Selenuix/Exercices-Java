/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casmomi;

import java.util.ArrayList;
import java.text.DecimalFormat;

/**
 *
 * @author Anthony
 */
public class Projet
{
    // Déclaration des attributs
    private String code;
    private String description;
    private String date;
    private ArrayList<Tranche> lesTranches;
    private Client leClient;
    
    // Constructeur
    public Projet(String code, String description, String date, Client client)
    {
        this.code = code;
        this.description = description;
        this.date = date;
        this.leClient = client;
        this.lesTranches = new ArrayList<>();
    }
    
    public void ajouterTranche(Tranche uneTranche)
    {
        this.lesTranches.add(uneTranche);
    }
    
    // Afficher le devis le moins cher
    public String devisLeMoinsCher(){
        String res;
        float total = 0;
        
        //En-tête
        res = "Projet :\t" + this.code + "\nDate :\t\t" + this.date + "\nClient :\t" + this.leClient.getNom() + "\nEmail :\t\t" + this.leClient.getEmail() + "\nTéléphone :\t" + this.leClient.getPortable();
        
        res += "\n--------------------------------------------------------------------------------\n";
        //Description + type de devis
        res = res + "Descritption :\t" + this.description;
        
        res += "\n--------------------------------------------------------------------------------\n";
        
        res += "\t\t\tDevis le moins cher\n";
        
        //Tableau
        for(Tranche uneTranche : lesTranches){
            res+="--------------------------------------------------------------------------------\n";
            res = res + "Tranche :\t" + uneTranche.getLibelle();
            
            if(uneTranche.offreLaMoinsChere().getlEntreprise()== null){
                res = res + "\n\t\t\t**Réservé Client**" + "\n";
            }
            else{
                res = res + "\n\t\t\tEntreprise :\t\t" + uneTranche.offreLaMoinsChere().getlEntreprise().getNom() + "\n";
            }
            
            //Durées
            res += "\t\t\tDurée estimée :\t\t" + uneTranche.getDureeEstimee() + "\n\t\t\tDurée proposée :\t" + uneTranche.offreLaMoinsChere().getDuree() + " jours\n";
            
            //Prix
            res += "\t\t\tPrix :\t\t\t" + uneTranche.offreLaMoinsChere().getPrix() + "\n";
            
            total += uneTranche.offreLaMoinsChere().getPrix();
        }
        
        res += "--------------------------------------------------------------------------------";
        //Pied de page
        DecimalFormat df = new DecimalFormat("#0.00");
        res += "\n\nTotal :\t\t\t" + df.format(total) + " €";
        res += "\nHonoraies MOMI (7%) :\t" + df.format((total * 0.07)) + " €";
        res += "\nTotal Projet :\t\t" + df.format(((total * 0.07) + total)) + " €";
        
        return res;
    }
    
    // Afficher le devis le plus rapide
    public String devisLePlusRapide()
    {
        String devis;
        float total, honoraires, totalProjet;
        
        // Initialisation
        total = 0;
        honoraires = 0;
        totalProjet = 0;
        
        // Affichage de l'entête
        devis = "--------------------------------------------";
        devis += "\nProjet : " + this.code;
        devis += "\nDate : " + this.date;
        devis += "\nClient : " + this.leClient.getNom();
        devis += "\nEmail : " + this.leClient.getEmail();
        devis += "\nTéléphone : " + this.leClient.getPortable();
        devis += "\n--------------------------------------------";
        devis += "\nDescription : " + this.description;
        devis += "\n--------------------------------------------";
        devis += "\n\tDevis le plus rapide";
        devis += "\n--------------------------------------------";
        devis += "\n\n";
        
        // Affichage du corps
        devis += "Tranche" + "\t\tEntreprise" + "\t\tDurée estimée" + 
                "\t\tDurée proposée" + "\t\tPrix";
        
        // Parcours des informations
        for(Tranche uneTranche : lesTranches)
        {
            // Affichage du nom de la tranche
            devis += "\n" + uneTranche.getLibelle();
            
            // Affichage du nom de l'entreprise
            if(uneTranche.offreLaPlusRapide().getlEntreprise() == null)
            {
                // Le client effectue la tranche
                devis += "\tRéservé Client";
            } else {
                // L'entreprise effectue la tranche
                devis += "\t" + uneTranche.offreLaPlusRapide().getlEntreprise().getNom();
            }
            
            // Affichage de la durée estimée
            devis += "\t" + uneTranche.getDureeEstimee() + " jours";
            
            // Affiche de la durée proposée
            devis += "\t" + uneTranche.offreLaPlusRapide().getDuree() + " jours";
            
            // Affichage du prix
            devis += "\t" + uneTranche.offreLaPlusRapide().getPrix() + " EUR";
            devis += "\n";
            
            // Calcul du total
            total = total + uneTranche.offreLaPlusRapide().getPrix();
        }
        
        // Calcul des honoraires
        honoraires = total * 0.07f;
            
        // Calcul du coût global        
        totalProjet = total + honoraires;
        DecimalFormat df = new DecimalFormat("#0.00");
        df.format(totalProjet);
        
        // Affichage du pied de page
        devis += "\n--------------------------------------------";
        devis += "\nTotal Travaux : " + total;
        devis += "\nHonoraire MOMI : " + honoraires;
        devis += "\nTotal Projet : " + totalProjet;
        
        return devis;
    }
}
