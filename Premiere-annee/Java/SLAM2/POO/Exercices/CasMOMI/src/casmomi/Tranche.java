/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casmomi;

import java.util.ArrayList;

/**
 *
 * @author Anthony
 */
public class Tranche
{
    // Déclaration des attributs
    private String libelle;
    private int dureeEstimee;
    private boolean reserveClient;
    private ArrayList<Offre> lesOffres;
    
    // Constructeur
    public Tranche(String libelle, int dureeEstimee, boolean reserveClient)
    {
        this.libelle = libelle;
        this.dureeEstimee = dureeEstimee;
        this.reserveClient = reserveClient;
        this.lesOffres = new ArrayList<Offre>();
    }
    
    // Ajout d'une offre à une Tranche
    public void ajouterOffre(float prix, int duree, Entreprise entreprise)
    {
        Offre uneOffre = new Offre(prix, duree, entreprise);
        this.lesOffres.add(uneOffre);
    }
    
    // Détermination de l'offre la plus rapide
    public Offre offreLaPlusRapide(){
        Offre laPlusRapide = lesOffres.get(0);
        
        // Parcours des offres
        for(Offre uneOffre : lesOffres){
            // Recherche de la plus rapide
            if(uneOffre.getDuree() < laPlusRapide.getDuree()){
                laPlusRapide = uneOffre;
            }
        }
        
        return laPlusRapide;     
    }
   
    // Détermination de l'offre la moins chere
    public Offre offreLaMoinsChere(){
        Offre laMoinsChere = lesOffres.get(0);
        
        // Parcours des offres
        for(Offre uneOffre : lesOffres){
            // Recherche de la moins chere
            if(uneOffre.getPrix() < laMoinsChere.getPrix()){
                laMoinsChere = uneOffre;
            }
        }
        
        return laMoinsChere;
    }

    /*
        Accesseurs
        Lecture
    */
    
    public String getLibelle() {
        return this.libelle;
    }

    public int getDureeEstimee() {
        return this.dureeEstimee;
    }
}
