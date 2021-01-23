package pokemonheritage;

/**
 * Regroupe tous les {@link Pokemon}
 *  @author Yll GASHI
 */
public class Pokemon
{
	/**
	 * Propriétés privées
	 */
	private String nom;
	private float poids;

	/**
	 * Constructeur
	 * @param nom String
	 * @param p float
	 */
	public Pokemon(String nom, float p)
	{
		this.nom = nom;
		this.poids = p;
	}

	/**
	 * Accesseur en lecture du poids
	 * @return poids float
	 */
	public float getPoids()
	{
		return this.poids;
	}

	/**
	 * Accesseur en lecture du nom
	 * @return nom String
	 */
	public String getNom()
	{
		return this.nom;
	}

	/**
	 * Renvoi du texte à afficher
	 * @return res String
	 */
	@Override
	public String toString()
	{
		String res = "Je suis le Pokémon " + this.nom + ", mon poids est de " + this.poids + "kg";

		return res;
	}
}
