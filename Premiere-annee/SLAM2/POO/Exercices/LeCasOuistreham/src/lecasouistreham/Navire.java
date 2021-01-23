/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecasouistreham;

/**
 *
 * @author Anthony
 */
public class Navire
{
    private String noLoyds;
    private String nom;
    private String libelleFret;
    private int quantiteFret;
    
    public Navire(String nL, String n, String lF, int qF)
    {
        this.noLoyds = nL;
        this.nom = n;
        this.libelleFret = lF;
        this.quantiteFret = qF;
    }
    
    public void decharger(int q)
    {
        quantiteFret = quantiteFret - q;
    }
    
    public boolean estDecharge()
    {
        boolean verification;
        
        if (quantiteFret == 0)
        {
            verification = true;
        } else
        {
            verification = false;
        }
        
        return verification;
    }
    
    public String getNom()
    {
        return this.nom;
    }
    
    public String getLibelleFret()
    {
        return this.libelleFret;
    }
    
    public int getQuantiteFret()
    {
        return this.quantiteFret;
    }
}
