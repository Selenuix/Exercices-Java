package caskes;

public class Client
{
	// Déclaration des attributs
	private int numero;
	private String nom;
	private String adresse;
	private String codePostal;
	private String ville;
	private float distance;

	// Constructeur
	public Client(int numero, String nom, String adresse, String codePostal, String ville,
		float distance) {
		this.numero = numero;
		this.nom = nom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.distance = distance;
	}

	// Accesseur en lecture
	public float getDistance() {
		return distance;
	}
}
