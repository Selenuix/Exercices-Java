package voitures;

public abstract class Camion extends Vehicule
{
	// Déclaration des attributs
	protected float charge;

	// Constructeur
	public Camion(String immatriculation, float poidsAVide, float charge)
	{
		super(immatriculation, poidsAVide);
		this.charge = charge;
	}

	// Affichage des informations
	public abstract String toString();

	// Calcul de la vitesse maximale
	public abstract int calculerVitesseMax();
}
