/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecasouistreham;

import java.util.ArrayList;

/**
 *
 * @author Anthony
 */
public class Port
{
    private ArrayList<ZoneStockage> lesZones;
    
    public Port()
    {
        this.lesZones = new ArrayList<>();
    }
    
    public void ajouterZone(ZoneStockage uneZoneStockage)
    {
        this.lesZones.add(uneZoneStockage);
    }
    
    public void decharger(Navire unNavire)
    {
        for(ZoneStockage uneZone : lesZones)
        {
            // Aficher zone
            System.out.println(uneZone.getNom());
            
            if(!unNavire.estDecharge()) {
                if(uneZone.getCapaDispo() >= unNavire.getQuantiteFret())
                {
                    uneZone.stocker(unNavire.getQuantiteFret());
                    System.out.println("Quantité à décharger :" + unNavire.getQuantiteFret() + " (la zone est pleine");
                    unNavire.decharger(unNavire.getQuantiteFret());
                } else
                {
                    if(!uneZone.estRemplie())
                    {
                        unNavire.decharger(uneZone.getCapaDispo());
                        System.out.println("Quantité à décharger :" + uneZone.getCapaDispo() + " (la zone est pleine");
                        uneZone.stocker(uneZone.getCapaDispo());                        
                    } else
                    {
                        System.out.println("Quantité à décharger : 0 (la zone est pleine");
                    }
                }
            } else
            {
                System.out.println("Quantité à décharger : 0 (navire vide)");
            }
        }
    }
}
