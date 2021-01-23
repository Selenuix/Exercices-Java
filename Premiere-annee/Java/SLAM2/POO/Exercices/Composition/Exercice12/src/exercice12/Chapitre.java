/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice12;

/**
 *
 * @author Anthony
 */
public class Chapitre {
    private int numero;
    private String titre;
    private int page;
    
    public Chapitre(int n, String t, int p)
    {
        this.numero = n;
        this.titre = t;
        this.page = p;
    }
    @Override
    public String toString()
    {
        return "Chapitre " + this.numero + " - " + this.titre + "\t\t\t" + this.page;
    }
}
