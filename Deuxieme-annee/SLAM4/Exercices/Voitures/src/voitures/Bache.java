package voitures;

public class Bache extends Camion
{
	// Déclaration des variables
	private final static float POIDS_A_VIDE = 4;
	private final static float CHARGE_MAX = 20;

	// Constructeur
	public Bache(String immatriculation, float charge)
	{
		super(immatriculation, Bache.POIDS_A_VIDE, charge);
	}

	// Affichage des informations
	public String toString()
	{
		// Déclaration des informations
		String res = "Bâche";

		// Construction de la chaîne
		res += "\nImmatriculation : " + super.immatriculation;
		res += "\nPoids à vide : " + Bache.POIDS_A_VIDE;
		res += "\nCharge : " + super.charge;
		res += "\nVitesse max : " + this.calculerVitesseMax() + " km/h";
		res += "\n----------------------------------------------";

		// Renvoi des informations
		return  res;
	}

	// Calcul de la vitesse maximale
	public int calculerVitesseMax()
	{
		int res = 130;

		if (this.charge > 0 && this.charge <= 3) {
			res = 110;
		}

		if (this.charge > 3 && this.charge <= 7) {
			res = 90;
		}

		if (this.charge > 7) {
			res = 80;
		}

		return res;
	}
}
