package voitures;

public class Minibus extends Vehicule
{
	// Déclaration des attributs
	private final static float POIDS_A_VIDE = 4;
	private final static int VITESSE_MAX = 150;

	// Constructeur
	public Minibus(String immatriculation)
	{
		super(immatriculation, Minibus.POIDS_A_VIDE);
	}

	// Affichage des informations
	public String toString()
	{
		// Déclaration des informations
		String res = "Mini-Bus";

		// Construction de la chaîne
		res += "\nImmatriculation : " + super.immatriculation;
		res += "\nPoids à vide : " + Minibus.POIDS_A_VIDE;
		res += "\nVitesse max : " + Minibus.VITESSE_MAX + " km/h";
		res += "\n----------------------------------------------";

		// Renvoi des informations
		return  res;
	}

	// Calcul de la vitesse maximale
	public int calculerVitesseMax()
	{
		return Minibus.VITESSE_MAX;
	}
}
