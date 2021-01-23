/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdis29;

/**
 *
 * @author ACISZEK1
 */
public class Pompier
{
    private String nom;
    private String prenom;
    private String numeroBip;
    
    public Pompier(String nom, String prenom, String numeroBip)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroBip = numeroBip;
    }
    
    // Récupération du numéro de bip
    public String getNumeroBip()
    {
        return this.numeroBip;
    }
    
    // Récupération du status d'un pompier
    public char getStatut(Periode unePeriode)
    {
        return unePeriode.getStatut(this);
    }
    
    public void missionier(Periode p)
    {
        p.missioner(this);
    }
}
