package pokemonheritage;

/**
 * {@link Aquatique} est un type de Pokemon
 *  @author Loïc DIETMANN
 *  @see Pokemon
 */
public class Aquatique extends Pokemon
{
	/**
	 * Déclaration des attributs privés
	 */
	private int nbNageoires;

	/**
	 * Constructeur principal
	 * @param nbNageoires Nombre de nageoires
	 */
	public Aquatique(String nom, float poids, int nbNageoires)
	{
		super(nom, poids);
		this.nbNageoires = nbNageoires;
	}

	/**
	 * Récupération du poids depuis la classe mère
	 * @return super(poids)
	 * @see Pokemon
	 */
	@Override
	public float getPoids()
	{
		return super.getPoids();
	}

	/**
	 * Récupération du nombre de nageoires
	 * @return nbNageoires int
	 */
	public int getNbNageoires()
	{
		return this.nbNageoires;
	}

	/**
	 * Renvoi du text qui s'applique uniquement aux {@link Aquatique}
	 * @return String resultats
	 */
	public String toString()
	{
		// Déclaration des variables
		String resultats = super.toString();

		// Construction de la chaîne de caractères
		resultats += " j'ai " + this.nbNageoires + " nageoires, ";

		// Retour de la valeur
		return resultats;
	}
}
