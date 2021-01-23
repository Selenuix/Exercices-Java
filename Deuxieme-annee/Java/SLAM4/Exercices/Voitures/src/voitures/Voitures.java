package voitures;

import java.util.ArrayList;

public class Voitures
{
	public static void main (String[] args)
	{
		// Déclaration des variables et objets
		Minibus minibus;
		Citerne citerne;
		Bache bache;
		Convoi convoi;
		ArrayList<Vehicule> lesVehicules;

		// Initialisation
		minibus = new Minibus("PL-123-FR");
		citerne = new Citerne("TK-852-DG",3);
		bache = new Bache("ZJ-715-ZF", 0);

		lesVehicules = new ArrayList<Vehicule>();
		lesVehicules.add(minibus);
		lesVehicules.add(citerne);
		lesVehicules.add(bache);

		convoi = new Convoi("Convoi 1", 45, lesVehicules);

		// Affichage des informations
		System.out.println(convoi.toString());
	}
}
