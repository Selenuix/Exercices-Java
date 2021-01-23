package pokemonheritage;

public class Casanier extends Terrestre
{
	/**
	 * Déclaration des attributs privés
	 */
	private int nbHeuresTv;

	/**
	 * Constructeur
	 * @param nbPattes
	 * @param taille
	 * @param nbHeuresTv
	 */

	public Casanier(String nom, float poids, int nbPattes, float taille, int nbHeuresTv)
	{
		super(nom, poids, nbPattes, taille);
		this.nbHeuresTv = nbHeuresTv;
	}

	/**
	 * Accesseur en lecture du nombre d'heures devant le TV
	 * @return nbHeuresTv int
	 */

	public int getNbHeuresTv()
	{
		return this.nbHeuresTv;
	}

	/**
	 * Renvoi du texte à afficher
	 * @return res String
	 */
	public String toString()
	{
		// Déclaration des variables
		String res = super.toString();

		// Construction de la cha�ne de caract�res
		res += ", le nombre d'heures de tv est de " + getNbHeuresTv() + "h";

		// Renvoi de la valeur
		return res;
	}

}
