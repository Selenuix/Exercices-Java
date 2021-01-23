/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice12;

import java.util.ArrayList;

/**
 *
 * @author Anthony
 */
public class Livre
{
    private String isbn;
    private String titre;
    private String titreBis;
    private ArrayList<Chapitre> lesChapitres;
    private ArrayList<Auteur> lesAuteurs;
    
    public Livre(String isbn, String t, String tb)
    {
        this.isbn = isbn;
        this.titre = t;
        this.titreBis = tb;
        this.lesChapitres = new ArrayList<Chapitre>();
        this.lesAuteurs = new ArrayList<Auteur>();
    }
    
    public void ajouterAuteur(Auteur unAuteur)
    {
        this.lesAuteurs.add(unAuteur);
    }
    
    public void ajouterChapitre(int n, String t, int p)
    {
        Chapitre unChapitre = new Chapitre(n, t, p);
        this.lesChapitres.add(unChapitre);
    }
    
    @Override
    public String toString()
    {
        String resultat = "";
        for (Auteur unAuteur : this.lesAuteurs)
        {
            resultat += unAuteur.getPrenom() + " " + unAuteur.getNom() + "\t";
        }
        resultat += "\n" + this.titre;
        resultat += "\n" + this.titreBis;
        
        for (Chapitre unChapitre : this.lesChapitres)
        {
            resultat += "\n" + unChapitre.toString();
        }
        return resultat;
    }
}
