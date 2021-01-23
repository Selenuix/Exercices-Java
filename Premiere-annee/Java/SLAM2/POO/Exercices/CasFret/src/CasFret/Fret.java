package CasFret;

import java.util.ArrayList;

public abstract class Fret
{
	// Définition des attributs
	private String villeDepart;
	private String villeArrivee;
	private int duree;
	private int distance;
	private TypeVehicule leTypeVehicule;
	private ArrayList<Lot> lesLots;

	// Contructeur
	public Fret(String villeDepart, String villeArrivee, int duree, int distance, TypeVehicule leTypeVehicule)
	{
		this.villeDepart = villeDepart;
		this.villeArrivee = villeArrivee;
		this.duree = duree;
		this.distance = distance;
		this.leTypeVehicule = leTypeVehicule;
		this.lesLots = new ArrayList<Lot>();
	}

	// Ajout d'un Lot
	public boolean ajouterLot(Marchandise m, int id, float poids, float volume)
	{
		// Vérification de l'unicité du lot
		boolean ok = true;
		for (Lot l : this.lesLots)
		{
			if(l.getLaMarchandise() == m)
			{
				ok = false;
			}
		}

		if(ok)
		{
			Lot unLot = new Lot(m, id, poids, volume);
			this.lesLots.add(unLot);
		}

		// Retour de la valeur
		return ok;
	}

	/*
		* Définition des setters et getters
		* En lecture
	*/

	public String getVilleDepart()
	{
		return this.villeDepart;
	}

	public String getVilleArrivee()
	{
		return this.villeArrivee;
	}

	public int getDistance()
	{
		return this.distance;
	}

	public int getDuree()
	{
		return this.duree;
	}

	public TypeVehicule getLeTypeVehicule()
	{
		return this.leTypeVehicule;
	}

	public ArrayList<Lot> getLesLots()
	{
		return lesLots;
	}

	// Calcul du poids total
	public float calculerPoidsTotal()
	{
		// Déclaration des variables
		float poidsTotal = 0;

		// Itérations
		for(Lot unLot : lesLots)
		{
			poidsTotal += unLot.getPoids();
		}

		// Retour du résultat
		return poidsTotal;
	}

	// Calcul du volume total
	public float calculerVolumetotal()
	{
		// Déclaration des variables
		float volumeTotal = 0;

		// Itérations
		for(Lot unLot : lesLots)
		{
			volumeTotal += unLot.getVolume();
		}

		// Retour du résultat
		return volumeTotal;
	}

	// Calcul du prix
	public abstract float calculerPrix();

	public abstract  float calculerEmpreinteCarbone();

	// Méthode toString abstraite
	@Override
	public abstract String toString();
}
