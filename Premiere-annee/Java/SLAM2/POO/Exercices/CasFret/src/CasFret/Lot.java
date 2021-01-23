package CasFret;

public class Lot
{
	// Déclaration des attributs
	private Marchandise laMarchandise;
	private int id;
	private float poids;
	private float volume;

	// Constructeur
	public Lot(Marchandise m, int id, float poids, float volume)
	{
		this.laMarchandise = m;
		this.id = id;
		this.poids = poids;
		this.volume = volume;
	}

	// Accesseurs
	public Marchandise getLaMarchandise()
	{
		return this.laMarchandise;
	}

	public int getId() {
		return this.id;
	}

	public float getVolume() {
		return this.volume;
	}

	public float getPoids() {
		return this.poids;
	}
}
