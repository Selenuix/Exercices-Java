package Exercice11;

import java.util.ArrayList;

/**
 * @author ACISZEK1
 */
public class Commande {
	private String reference;
	private String dateCommande;
	private String resultat;
	private  float montant;
	private Client leClient;
	private ArrayList<LigneCommande> lesLignes;

	// Définition du constructeur
	public Commande(String ref, String dateC, Client unClient) {
		this.reference = ref;
		this.dateCommande = dateC;
		this.leClient = unClient;
		this.montant = 0;
		this.lesLignes = new ArrayList<LigneCommande>();
	}

	// Renvoi des informations
	public String toString() {
		resultat = "----------------------------------------";
		resultat += "\n\t\t\tCommande";
		resultat += "\n----------------------------------------";
		resultat += "\nRéférence : " + this.reference;
		resultat += "\nDate : " + this.dateCommande;
		resultat += "\n----------------------------------------";
		resultat += "\nRéférence Client : " + leClient.getReference();
		resultat += "\nNom : " + leClient.getNom();
		resultat += "\n----------------------------------------";
		for (LigneCommande uneLigne : lesLignes) {
			resultat += uneLigne.toString();
		}
		resultat += "\n----------------------------------------";
		resultat += "\t\t\tTotal : \t" + leClient.getChiffreAffaires();
		resultat += "\n----------------------------------------";
		resultat += "Nouveau chiffre d'affaire du client : " + leClient;


		/*resultat += "\nMontant : " + this.montant + "€";
		resultat += "\nRéférence client : " + leClient.getReference();
		resultat += "\nNom client : " + leClient.getNom();
		resultat += "\nVille client : " + leClient.getVille();
		resultat += "\nChiffre d'affaire : " + leClient.getChiffreAffaires() + "€";*/
		return resultat;
	}

	public void ajouterLigne(LigneCommande uneLigne) {
		this.lesLignes.add(uneLigne);
		this.leClient.cumulerCa(uneLigne.montantLigne());
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
