package CasFret;

public class TypeVehicule
{
	// Définition des attributs
	private String libelle;
	private float tauxConsoKm;
	private int volumeMax;

	// Constructeur
	public TypeVehicule(String libelle, float tauxConsoKm, int volumeMax)
	{
		this.libelle = libelle;
		this.tauxConsoKm = tauxConsoKm;
		this.volumeMax = volumeMax;
	}

	/*
	 * Définition des setters et getters
	 * En lecture
	 */

	public String getLibelle() {
		return this.libelle;
	}

	public float getTauxConsoKm() {
		return this.tauxConsoKm;
	}

	public int getVolumeMax() {
		return this.volumeMax;
	}
}
