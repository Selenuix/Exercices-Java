package Exercice11;

/**
 * @author ACISZEK1
 */
public class LigneCommande {
	private int quantite;
	private String resultat;
	private Article lArticle;

	public LigneCommande(int q, Article unArticle) {
		this.quantite = q;
		this.lArticle = unArticle;
	}

	public float montantLigne() {
		return lArticle.getPrixVente() * this.quantite;
	}

	public String toString() {
		resultat = lArticle.getRef();
		resultat += "\t" + lArticle.getLibelle();
		resultat += "\t" + lArticle.getPrixVente();
		resultat += "\tx";
		resultat += "\t" + this.quantite;
		resultat += "\tTotal ligne" + "\t" + this.montantLigne();
		return resultat;
	}
}