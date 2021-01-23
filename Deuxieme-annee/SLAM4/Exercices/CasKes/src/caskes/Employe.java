package caskes;

public class Employe
{
	// Déclaration des attributs
	private int numero;
	private String nom;
	private String dateEmbauche;
	private Grade qualification;

	// Constructeur
	public Employe(int numero, String nom, String dateEmbauche) {
		this.numero = numero;
		this.nom = nom;
		this.dateEmbauche = dateEmbauche;
	}

	// Calcul du coût horaire
	public float coutHoraire()
	{
		float cout = this.qualification.getTaux();
		int anciennete = Temps.nbreAnnees(this.dateEmbauche);

		if (anciennete >= 5)
		{
			if (anciennete < 11)
			{
				cout *= 1.05f;
			} else
			{
				if (anciennete < 15)
				{
					cout *= 1.08f;
				} else
				{
					cout *= 1.12f;
				}
			}
		}

		return cout;
	}
}
