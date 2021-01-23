/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heritage;

import java.util.ArrayList;

/**
 * @author Anthony
 */
public class Heritage {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		Salarie salarie1;
		Representant representant1, representant2;

		salarie1 = new Salarie(1, "Momo", "Web designer", 1830);
		representant1 = new Representant(2, "Manu", "Représentant secteur Ouest", 1450f, 13000f, 350f);
		representant2 = new Representant(3, "Mumu", "Représentante secteur Est", 1450f, 18000f, 550f);


		System.out.println(salarie1.getSalaire());
		System.out.println(representant2.getSalaire());

		ArrayList<Salarie> lesSalaries = new ArrayList<>();
		lesSalaries.add(salarie1);
		lesSalaries.add(representant1);
		lesSalaries.add(representant2);

		for (Salarie s : lesSalaries) {
			System.out.println(s.toString());
		}
	}

}
