package voitures;

public abstract class Vehicule
{
	// Déclaration des attributs
	protected String immatriculation;
	protected float poidsAVide;

	// Constructeur
	public Vehicule(String immatriculation, float poidsAVide)
	{
		this.immatriculation = immatriculation;
		this.poidsAVide = poidsAVide;
	}

	// Affichage des informations
	@Override
	public abstract String toString();

	// Calcul de la vitesse maximale
	public abstract int calculerVitesseMax();
}
