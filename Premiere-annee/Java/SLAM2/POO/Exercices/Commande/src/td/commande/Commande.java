package td.commande;

public class Commande {
	private String reference;
	private String dateCommande;
	private String resultat;
	private  float montant;
	private Client leClient;

	// Définition du constructeur
	public Commande(String ref, String dateC, Client unClient) {
		this.reference = ref;
		this.dateCommande = dateC;
		this.leClient = unClient;
		this.montant = 0;
	}

	// Renvoi des informations
	public String toString() {
		resultat = "----------------------------------------";
		resultat += "\nRéférence commande : " + this.reference;
		resultat += "\nDate : " + this.dateCommande;
		resultat += "\nMontant : " + this.montant + "€";
		resultat += "\nRéférence client : " + leClient.getReference();
		resultat += "\nNom client : " + leClient.getNom();
		resultat += "\nVille client : " + leClient.getVille();
		resultat += "\nChiffre d'affaire : " + leClient.getChiffreAffaires() + "€";
		return resultat;
	}

	// Définition des accesseurs en lecture
	public String getReference() {
		return this.reference;
	}

	public String getDateCommande() {
		return this.dateCommande;
	}

	public float getMontant() {
		return this.montant;
	}

	// Définition des accesseurs en écriture
	public void setMontant(float m) {
		this.montant = m;
	}

}
