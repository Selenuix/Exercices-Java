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
public class ZoneStockage
{
    private String nom;
    private int capaDispo;
    private int capaMax;
    
    public ZoneStockage(String n, int cD, int cM)
    {
        this.nom = n;
        this.capaDispo = cD;
        this.capaMax = cM;
    }
    
    public void stocker(int q)
    {
        capaDispo = capaDispo + q;
    }
    
    public boolean estRemplie()
    {
        boolean verification;
        
        if (capaDispo == capaMax)
        {
            verification = false;
        } else
        {
            verification = true;
        }
        
        return verification;
    }
    
    public String getNom()
    {
        return this.nom;
    }
    
    public int getCapaDispo()
    {
        return this.capaDispo;
    }
}
