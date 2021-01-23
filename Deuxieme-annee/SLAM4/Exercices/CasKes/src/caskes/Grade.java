package caskes;

public class Grade
{
	// Déclaration des attributs
	private char code;
	private String libelle;
	private float taux;

	// Constructeur
	public Grade(char code, String libelle, float taux) {
		this.code = code;
		this.libelle = libelle;
		this.taux = taux;
	}

	// Accesseur en lecture
	public float getTaux() {
		return this.taux;
	}
}
