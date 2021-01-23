package Exercice10;

/**
 *
 * @author ACISZEK1
 */
public class Acteur {
	private String nom;
	private String prenom;

	public Acteur(String n, String p) {
		this.nom = n;
		this.prenom = p;
	}

	public String getNom() {
		return this.nom;
	}

	public String getPrenom() {
		return prenom;
	}
}