/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package film;

import java.util.ArrayList;

/**
 *
 * @author Anthony
 */
public class Film
{
    // Déclaration des attributs
    private String titre;
    private int annee;
    private String realisateur;
    private ArrayList<Jouer> lesRoles;
    
    // Constructeur principal
    public Film(String titre, int annee, String realisateur)
    {
        this.titre = titre;
        this.annee = annee;
        this.realisateur = realisateur;
    }
    
    // Ajouter Acteur
    public boolean ajouterJouer(Acteur a, int rang, String role)
    {
        // Vérifier unicité
        boolean ok = true;
        for(Jouer j : this.lesRoles)
        {
            if(j.getLActeur() == a)
            {
                ok = false;
            }
        }
        
        // Fournisseur non existant
        if(ok)
        {
            Jouer unJouer = new Jouer(rang, role, a);
            this.lesRoles.add(unJouer);
        }
        
        return ok;
    }
    
    public String toString()
    {
        // Renvoi des informations
        String res;
        res = this.titre + " (" + this.annee + ")";
        res += "\nDe " + this.realisateur;
        res += "\nAvec :";

        for(Jouer j : this.lesRoles)
        {
            if(j.getRang() == 1)
            {
                res += "\n\tRôles principaux :";
                res += "\n\t" + j.getLActeur().getPrenom() + j.getLActeur().getNom() + " (rôle : " + j.getRole() + ")";
            } else
            {
                res += "Seconds rôles :";
                res += "\n\t" + j.getLActeur().getPrenom() + j.getLActeur().getNom() + " (rôle : " + j.getRole() + ")";
            }
        }        
        
        return res;
    }
    
}
