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
public class Rapace extends Oiseau{
    public Rapace(){
        super();
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "\t--> Je suis un rapace\n\t";
    }
}
