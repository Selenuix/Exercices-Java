package voitures;

import java.util.ArrayList;

public class Convoi
{
	// Déclaration des attributs
	private String nom;
	private float nbKilometres;
	private ArrayList<Vehicule> lesVehicules;

	// Constructeur
	public Convoi (String nom, float nbKilometres, ArrayList<Vehicule> lesVehicules)
	{
		this.nom = nom;
		this.nbKilometres = nbKilometres;
		this.lesVehicules = lesVehicules;
	}

	// Affichage des informations
	@Override
	public String toString()
	{
		// Construction de la chaîne
		String res = "Nom : " + this.nom;
		res += "\nNombre de kilomètres : " + this.nbKilometres + " km";
		res += "\nTemps trajet : " + this.calculerTempsPrevu() + " min";
		res += "\nListe des véhicules :";

		// Affichage des véhicules du convoi
		for (Vehicule unVehicule : this.lesVehicules)
		{
			res += "\n\n" + unVehicule.toString();
		}

		// Renvoi du résultat
		return res;
	}

	public float calculerTempsPrevu()
	{
		// Déclaration des variables
		int vitesseMin = 200;
		int vitesse;
		float temps; // En minutes

		// Parcours de la liste des véhicules
		for (Vehicule unVehicule : this.lesVehicules)
		{
			// Recherche du plus lent
			vitesse = unVehicule.calculerVitesseMax();

			if (vitesse < vitesseMin)
			{
				vitesseMin = vitesse;
			}
		}

		// t = d / v
		temps = this.nbKilometres / (float) vitesseMin;

		return temps;
	}
}
