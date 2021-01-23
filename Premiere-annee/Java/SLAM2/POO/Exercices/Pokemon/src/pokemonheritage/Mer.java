package pokemonheritage;

/**
 * @author Musa
 * @see Aquatique
 */
public class Mer extends Aquatique
{
	/**
	 * Constructeur
	 * @param nom
	 * @param poids
	 * @param nbNageoires
	 */
	public Mer(String nom, float poids, int nbNageoires)
	{
		super(nom, poids, nbNageoires);
	}

	/**
	 * Calcul de la vitesse des types {@link Mer}
	 * @return vitesse float
	 */
	public float calculerVitesse()
	{
		// Calcul de la vitesse
		return super.getPoids() / 25 * super.getNbNageoires();
	}

	/**
	 * Renvoi du text qui s'applique uniquement aux {@link Mer}
	 * @return res String
	 */
	@Override
	public String toString()
	{
		// Déclaration des variables
		String res = super.toString();

		// Construction de la chaîne de caractères
		res += ", ma vitesse est de " + this.calculerVitesse() + " km/h";

		// Renvoi de la valeur
		return res;
	}
}