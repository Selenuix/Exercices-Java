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
public class Sdis
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Création de la caserne        
        Pompier p1 = new Pompier("Boeglin", "Vincent", "1");
        Pompier p2 = new Pompier("Gesser", "Phébus", "2");        
        Pompier p3 = new Pompier("Goepp", "Marie", "3");        
        Pompier p4 = new Pompier("Ciszek", "Anthony", "4");
        Pompier p5 = new Pompier("Gashi", "Yll", "5");      
        Pompier p6 = new Pompier("Freund", "Antoine", "6");
        Pompier p7 = new Pompier("Ostermann", "Luke", "7");
        Pompier p8 = new Pompier("Dietmann", "Loïc", "8");        
        Pompier p9 = new Pompier("Da Costa Tork", "Savio", "9");
        Pompier p10 = new Pompier("Hugel", "Maxime", "10");
        Pompier p11 = new Pompier("Ballay", "Musaille", "11");        
        Pompier p12 = new Pompier("Trabach", "Antoine", "12");
        
        
        ArrayList<Pompier> lesPompiers = new ArrayList();
        lesPompiers.add(p1);
        lesPompiers.add(p2);
        lesPompiers.add(p3);
        lesPompiers.add(p4);
        lesPompiers.add(p5);                
        lesPompiers.add(p6);
        lesPompiers.add(p7);
        lesPompiers.add(p8);
        lesPompiers.add(p9);
        lesPompiers.add(p10);
        lesPompiers.add(p11);
        lesPompiers.add(p12);        
        
        Caserne c = new Caserne(lesPompiers);
        
        Date d = new Date();
        Periode unePeriode = new Periode(d, 2);        
        
        //Les pompiers disponibles
        ArrayList<Pompier> lesPompiersDispo = new ArrayList();
        lesPompiersDispo.add(p1);
        lesPompiersDispo.add(p2);
        lesPompiersDispo.add(p3);
        lesPompiersDispo.add(p4);
        lesPompiersDispo.add(p5);                
        lesPompiersDispo.add(p6);        

        //Les pompiers au travail
        ArrayList<Pompier> lesPompiersAuTravail = new ArrayList<>();  
        lesPompiersAuTravail.add(p7);
        lesPompiersAuTravail.add(p8);
        lesPompiersAuTravail.add(p9);
        lesPompiersAuTravail.add(p10);
        lesPompiersAuTravail.add(p11);
        lesPompiersAuTravail.add(p12);         
        
        
        unePeriode.mettreDispo(lesPompiersDispo);
        unePeriode.mettreAuTravail(lesPompiersAuTravail);
        
        //Gérer un appel
        c.appelerEquipe(unePeriode,8);
    }
    
}
