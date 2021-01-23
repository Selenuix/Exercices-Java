/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdis29;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ACISZEK1
 */
public class Periode
{
    // Déclaration des attributs
    private Date laDate;
    private int laTranche;
    private ArrayList<Pompier> enMission;
    private ArrayList<Pompier> auTravail;
    private ArrayList<Pompier> disponible;
    
    // Constructeur
    public Periode(Date laDate, int laTranche) {
        this.laDate = laDate;
        this.laTranche = laTranche;
        this.enMission = new ArrayList<>();
        this.auTravail = new ArrayList<>();
        this.disponible = new ArrayList<>();
    }
    
    public char getStatut(Pompier unPompier)
    {
        char res = 'm';
        if (this.disponible.contains(unPompier))
        {
            res = 'd';
        } else
        {
            if (this.auTravail.contains(unPompier))
            {
                res = 't';
            }
        }
        
        return res;
    }
    
    public void missioner(Pompier unPompier)
    {
        if (this.disponible.contains(unPompier))
        {
            this.disponible.remove(unPompier);
            this.enMission.add(unPompier);
        } else
        {
            this.auTravail.remove(unPompier);
            this.enMission.add(unPompier);
        }
    }

    public ArrayList<Pompier> selectEquipe(int nbPompier)
    {
        ArrayList<Pompier> res;
        int i = 0;
        Pompier unPompier;
        
        res = new ArrayList<>();
        
        while (i < nbPompier && i < this.disponible.size())
        {
            unPompier = this.disponible.get(i);
            res.add(unPompier);
            i++;
        }
        
        if (i < nbPompier)
        {
            int j = 0;
            while (i < nbPompier && j < this.auTravail.size())
            {
                unPompier = this.auTravail.get(j);
                res.add(unPompier);
                i++;
                j++;
            }
        }
        
        return res;
    }
    
    public void mettreDispo(ArrayList<Pompier> p)
    {
        this.disponible = p;
    }
    
    public void mettreAuTravail(ArrayList<Pompier> p)
    {
        this.auTravail = p;
    }    
    
    public void mettreEnMission(ArrayList<Pompier> p)
    {
        this.enMission = p;
    }
}
