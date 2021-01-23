package pokemonheritage;

/**
 * @author Vincent BOEGLIN
 */
public class Croisiere extends Aquatique
{

	/**
	 * Constructeur
	 * @param nom
	 * @param poids
	 * @param nbNageoires
	 */
	public Croisiere (String nom, float poids, int nbNageoires)
	{
		super(nom, poids, nbNageoires);
	}

	/**
	 * Calcul de la vitesse des {@link Croisiere}
	 * @return vitesse float
	 */
	public float calculerVitesse()
	{
		// Calcul de la vitesse
		return (this.getPoids() / 25 * this.getNbNageoires()) / 2;
	}

	/**
	 * Récupération du poids depuis la classe mère
	 * @return poids float
	 * @see Aquatique
	 */
	@Override
	public float getPoids()
	{
		return super.getPoids();
	}

	/**
	 * Récupération du poids depuis la classe mère
	 * @return nbNageoires int
	 * @see Aquatique
	 */
	@Override
	public int getNbNageoires()
	{
		return super.getNbNageoires();
	}

	/**
	 * Renvoi du text qui s'applique uniquement aux {@link Aquatique}
	 * @return res String
	 */
	@Override
	public String toString()
	{
		// Déclaration des variables
		String res = super.toString();

		// Construction de la chaîne de caractères
		res += ", ma vitesse est de " + calculerVitesse()
				+ " km/h";

		// Renvoi du résultat
		return res;
	}
}
