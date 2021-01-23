/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdis29;

import java.util.ArrayList;

/**
 *
 * @author ACISZEK1
 */
public class Caserne
{
    // Déclaration des attributs
    private ArrayList<Pompier> lesPompiers;

    // Constructeur
    public Caserne(ArrayList<Pompier> pompiers)
    {
        this.lesPompiers = pompiers;
    }
    
    private void appeler(String numeroBip)
    {
        System.out.println(numeroBip);
    }
    
    public int appelerEquipe(Periode p, int nbPompier)
    {
        ArrayList<Pompier> equipe;
        equipe = p.selectEquipe(nbPompier);
        
        for (Pompier unPompier : equipe)
        {
            p.missioner(unPompier);
            this.appeler(unPompier.getNumeroBip());
        }
        
        return equipe.size();
    }
}
