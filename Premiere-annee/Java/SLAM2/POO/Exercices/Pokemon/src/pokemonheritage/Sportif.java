package pokemonheritage;

/**
 * @author Marie
 * @see Terrestre
 */
public class Sportif extends Terrestre
{
	/**
	 * Déclaration des attributs privés
	 */
	private int frequenceCardiaque;

	/**
	 * Constructeur
	 * @param nbPattes
	 * @param taille
	 * @param frequenceCardiaque
	 */
	public Sportif(String nom, float poids, int nbPattes, float taille, int frequenceCardiaque)
	{
		super(nom, poids, nbPattes, taille);
		this.frequenceCardiaque = frequenceCardiaque;
	}

	/**
	 * Accesseur en lecture de la fréquence cardiaque
	 * @return frequenceCardiaque int
	 */
	public int getFrequence()
	{
		return this.frequenceCardiaque;
	}

	/**
	 * Renvoi du texte à afficher
	 * @return res String
	 */
	public String toString()
	{
		// Déclaration des variables
		String res = super.toString();

		// Construction de la chaîne de caractères
		res += ", ma fréquence cardiaque est de " + getFrequence() + " pulsations à la minute";

		// Renvoi de la valeur
		return res;
	}

}

