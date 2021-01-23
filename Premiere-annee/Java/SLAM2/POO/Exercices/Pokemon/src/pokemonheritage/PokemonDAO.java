package pokemonheritage;

import java.util.ArrayList;

/**
 * PokemonDAO permet d'accéder d'ajouter un Pokemon,
 * de calculer la vietesse moyenne de tous les Pokemon
 * et de calculer la vitesse moyenne des Sportif
 * @author Antoine FREUND
 * @see Pokemon
 * @see Sportif
 */
public class PokemonDAO
{
	/**
	 * Lien de 1 à plusieurs avec {@link Pokemon}
	 */
	private ArrayList<Pokemon> lesPokemons;

	/**
	 * Constructeur
	 */
	public PokemonDAO()
	{
		this.lesPokemons = new ArrayList<Pokemon>();
	}

	/**
	 * Insertion d'un {@link Pokemon} dans lesPokemons
	 * @param p
	 */
	public void insererPokemon(Pokemon p)
	{
		this.lesPokemons.add(p);
	}

	/**
	 * Calcul de la vitesse moyenne des tous les {@link Pokemon}
	 * @return float vitesseMoyenne
	 */
	public float calculerVitesseMoyenne()
	{
		/**
		 * Déclaration des variables
		 */
		int nbPokemon = 0;
		float vitesseMoyenne = 0.0f;
		float vitesseMoyenneSportifs = 0;
		float vitesseMoyenneCasaniers = 0;
		float vitesseMoyenneMers = 0;
		float vitesseMoyenneCroisieres = 0;

		/**
		 * Parcours de tous les {@link Pokemon}
		 */
		for(Pokemon p : lesPokemons)
		{
			/**
			 * Si le {@link Pokemon} p est de type {@link Terrestre}
			 */
			if(p instanceof Terrestre)
			{
				/**
				 * Si le {@link Pokemon} p est de type {@link Sportif}
				 */
				if(p instanceof Sportif)
				{
					// Calcul de la vitesse totale des Sportif
					vitesseMoyenneSportifs += ((Sportif) p).calculerVitesse();

					// Incrémentation du nombre de Pokemon
					nbPokemon ++;
				}

				/**
				 * Si le {@link Pokemon} p est de type {@link Casanier}
				 */
				if(p instanceof Casanier)
				{
					// Calcul de la vitesse totale des Casanier
					vitesseMoyenneCasaniers += ((Casanier) p).calculerVitesse();

					// Incrémentation du nombre de Pokemon
					nbPokemon ++;
				}
			}

			/**
			 * Si le {@link Pokemon} p est de type {@link Aquatique}
			 */
			if(p instanceof Aquatique)
			{
				/**
				 * Si le {@link Pokemon} p est de type {@link Mer}
				 */
				if(p instanceof Mer)
				{
					// Calcul de la vitesse totale des Mer
					vitesseMoyenneMers += ((Mer) p).calculerVitesse();

					// Incrémentation du nombre de Pokemon
					nbPokemon ++;
				}

				/**
				 * Si le {@link Pokemon} p est de type {@link Croisiere}
				 */
				if(p instanceof Croisiere)
				{
					// Calcul de la vitesse totale des Croisiere
					vitesseMoyenneCroisieres += ((Croisiere) p).calculerVitesse();

					// Incrémentation du nombre de Pokemon
					nbPokemon ++;
				}
			}
		}

		// Calcul de la vitesse moyenne
		vitesseMoyenne = (vitesseMoyenneSportifs + vitesseMoyenneCasaniers + vitesseMoyenneMers + vitesseMoyenneCroisieres) / nbPokemon;

		// Retour de la valeur
		return vitesseMoyenne;
	}

	/**
	 * Calcul de la vitesse moyenne des {@link Sportif}
	 * @return float vitesseMoyenneSportif
	 */
	public float calculerVitesseMoyenneSportif()
	{
		// Déclaration des variables
		float vitesseMoyenneSportif;
		float sommeVitesse = 0f;
		int nbPokemon = 0;

		// Parcours de tous les Pokemons
		for(Pokemon p : lesPokemons)
		{
			// Si le Pokemon p est un Sportif
			if(p instanceof Sportif)
			{
				// Calcul de la vitesse totale
				sommeVitesse += ((Sportif)p).calculerVitesse();

				// Incrémentation du nombre de Pokemon
				nbPokemon++;
			}
		}

		// Calcul de la vitesse moyenne
		vitesseMoyenneSportif = sommeVitesse / nbPokemon;

		// Renvoi de la valeur
		return vitesseMoyenneSportif;
	}
}