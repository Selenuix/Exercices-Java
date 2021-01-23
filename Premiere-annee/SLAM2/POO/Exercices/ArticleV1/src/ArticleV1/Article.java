package ArticleV1;

public class Article
{
	private String ref;
	private String libelle;
	private float prixVente;
	private int stock;


	public Article(String ref, String libelle, float prixVente, int stock) {
		this.ref = ref;
		this.libelle = libelle;
		this.prixVente = prixVente;
		this.stock = stock;
	}

	public float valeurStock()
	{
		return this.prixVente * this.stock;
	}

	public String getRef() {
		return this.ref;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public float getPrixVente() {
		return this.prixVente;
	}

	public int getStock() {
		return this.stock;
	}

	@Override
	public String toString() {
		return "Article{" +
				"ref='" + ref + '\'' +
				", libelle='" + libelle + '\'' +
				", prixVente=" + prixVente +
				", stock=" + stock +
				'}';
	}
}
