package caskes;

public class Intervention
{
	// Déclaration des attributs
	private int numero;
	private String date;
	private int duree;
	private float tarifKm;
	private Employe technicien;

	public Intervention(int numero, String date, int duree, float tarifKm, Employe technicien) {
		this.numero = numero;
		this.date = date;
		this.duree = duree;
		this.tarifKm = tarifKm;
		this.technicien = technicien;
	}

	// Calcul des frais kilométriques occasionnés par une intervention
	public float fraisKm(float dist)
	{
		return this.tarifKm * dist;
	}

	// Calcul et retourne les frais de main d'œuvre occasionnés
	public float fraisMo()
	{
		return this.technicien.coutHoraire() * this.duree;
	}
}
