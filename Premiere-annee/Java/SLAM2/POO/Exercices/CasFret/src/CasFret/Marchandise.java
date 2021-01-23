package CasFret;

public class Marchandise
{
	// Définition des attributs
	private int id;
	private String libelle;
	private String precautions;

	// Constructeur
	public Marchandise(int id, String libelle, String precautions)
	{
		this.id = id;
		this.libelle = libelle;
		this.precautions = precautions;
	}

	public int getId() {
		return this.id;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public String getPrecautions() {
		return this.precautions;
	}
}
