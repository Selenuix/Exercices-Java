package Exercice11;

/**
 *
 * @author ACISZEK1
 */
public class Article {
	// Attributs privés
	private String ref;
	private String libelle;
	private String resultat;
	private float prixAchat;
	private float prixVente;
	private int stock;

	// Constructeur
	public Article(String r, String l, float pa, float pv, int s) {
		this.ref = r;
		this.libelle = l;
		this.prixAchat = pa;
		this.prixVente = pv;
		this.stock = s;
	}

	// Retourne la valeur du stock
	public float valeurStock() {
		return this.prixVente * this.stock;
	}

	// Retourne la marge sur un produit
	private float marge() {
		return this.prixVente - this.prixAchat;
	}

	/*
	 * Retourne les informations sur le produit
	 * @return String resultat
	 */
	public String toStringDetail() {
		resultat = "Référence : " + this.ref;
		resultat += "\nLibellé : " + this.libelle;
		resultat += "\nPrix de vente : " + this.prixVente;
		resultat += "\nPrix d'achat : " + this.prixAchat + "" + "\t(Marge : " + this.marge() + "€)";
		resultat += "\nStock : " + this.stock + "\t(Valeur du stock : " + this.valeurStock() + "€)";
		return resultat;
	}

	public String toString() {
		resultat = "Référence : " + this.ref;
		resultat += "\nLibellé : " + this.libelle;
		resultat += "\nPrix de vente : " + this.prixVente;
		resultat += "\nPrix d'achat : " + this.prixAchat;
		resultat += "\nStock : " + this.stock;
		return resultat;
	}

	// Accesseurs
	// ref : en lecture
	public String getRef() {
		return this.ref;
	}

	// libelle : en lecture
	public String getLibelle() {
		return this.libelle;
	}

	// prixVente en lecture
	public float getPrixVente() {
		return this.prixVente;
	}

	// stock en lecture
	public float getStock() {
		return this.stock;
	}

	// En écriture

	public void stocker(int nbArticle) {
		this.stock = this.stock + nbArticle;
	}
}
