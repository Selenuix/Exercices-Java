package pokemonheritage;

/**
 * {@link Terrestre} est un type de {@link Pokemon}
 *  @author Phébus GASSER
 *  @see Pokemon
 */
public class Terrestre extends Pokemon
{
	/**
	 * Déclaration des attributs privés
	 */
	private int nbPattes;
	private float taille;

	/**
	 * Constructeur
	 * @param nom
	 * @param poids
	 * @param nbPattes
	 * @param taille
	 */
	public Terrestre(String nom, float poids, int nbPattes, float taille)
	{
		super(nom, poids);
		this.nbPattes = nbPattes;
		this.taille = taille;
	}

	/**
	 * Récupération du nombre de pattes
	 * @return nbPattes int
	 */
	public int getNbPattes()
	{
		return this.nbPattes;
	}

	/**
	 * Récupération de la taille
	 * @return taille float
	 */
	public float getTaille()
	{
		return this.taille;
	}

	/**
	 * Calcul de la vitesse d'un {@link Terrestre}
	 * @return vitesse float
	 */
	public float calculerVitesse()
	{
		// Calcul de la vitesse
		return (this.nbPattes * this.taille) * 3;
	}

	/**
	 * Renvoi du text qui s'applique uniquement aux {@link Terrestre}
	 * @return res String
	 */
	@Override
	public String toString()
	{
		// Déclaration des variables
		String res;

		// Récupération de la chaîne de caractère de la classe parent
		res = super.toString();

		// Construction de la chaîne
		res += ", ma vitesse est de " + this.calculerVitesse() + " km/h";

		return res;
	}
}