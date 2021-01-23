/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oiseaux;

/**
 *
 * @author Anthony
 */
public class Vautour extends Rapace {
    public Vautour(){
        super();
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "\t--> J'appartient à la famille des vautours\n\t\t";
    }
}
