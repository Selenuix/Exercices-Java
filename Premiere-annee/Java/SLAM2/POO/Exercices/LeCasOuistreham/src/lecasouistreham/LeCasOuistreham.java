/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecasouistreham;

import java.awt.Point;

/**
 *
 * @author Anthony
 */
public class LeCasOuistreham {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Déclaration des objets
        Navire navire1;
        Port port1;
        ZoneStockage zone1, zone2, zone3, zone4, zone5;
        
        navire1 = new Navire("9523938", "KRISTIN C", "soja", 250);
        port1 =  new Port();
        zone1 = new ZoneStockage("z1", 100, 100);
        zone2 = new ZoneStockage("z2", 150, 150);
        zone3 = new ZoneStockage("z3", 160, 160);
        zone4 = new ZoneStockage("z4", 100, 100);
        zone5 = new ZoneStockage("z5", 80, 80);
        
        port1.ajouterZone(zone1);
        port1.ajouterZone(zone2);
        port1.ajouterZone(zone3);
        port1.ajouterZone(zone4);
        port1.ajouterZone(zone5);
        
        port1.decharger(navire1);
        
        
        //System.out.println(navire1.estDecharge());
        
        // Affichage des capacités
        /*System.out.println(zone1.estRemplie());
        System.out.println(zone2.estRemplie());
        System.out.println(zone3.estRemplie());
        System.out.println(zone4.estRemplie());
        System.out.println(zone5.estRemplie());*/
    }
    
}
