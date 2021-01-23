package voitures;

public class Citerne extends Camion
{
	// Déclaration des attributs
	private final static float POIDS_A_VIDE = 3;
	private final static int CHARGE_MAX = 10;

	// Constructeur
	public Citerne(String immatriculation, float charge)
	{
		super(immatriculation, Citerne.POIDS_A_VIDE, charge);
	}

	// Affichage des informations
	public String toString()
	{
		// Déclaration des informations
		String res = "Citerne";

		// Construction de la chaîne
		res += "\nImmatriculation : " + super.immatriculation;
		res += "\nPoids à vide : " + Citerne.POIDS_A_VIDE;
		res += "\nCharge : " + super.charge;
		res += "\nVitesse max : " + this.calculerVitesseMax() + " km/h";
		res += "\n----------------------------------------------";

		// Renvoi des informations
		return  res;
	}

	// Calcul de la vitesse maximale
	public int calculerVitesseMax()
	{
		// Déclaration et initialisation de la vitesse de départ
		int res = 130;

		// Vérifications
		if (this.charge > 0 && this.charge <= 1)
		{
			res = 110;
		}

		if (this.charge > 1 && this.charge <= 4)
		{
			res = 90;
		}

		if (this.charge > 4)
		{
			res = 80;
		}

		// Renvoi du résultat
		return res;
	}
}
