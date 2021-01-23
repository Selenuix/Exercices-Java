/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heritage;

/**
 * @author Anthony
 */
public class Salarie {
	// Attributs privés
	private int num;
	private String nom;
	private String fonction;

	// Attributs protégés
	protected float salaire;

	public Salarie(int n, String nom, String f, float s) {
		this.num = n;
		this.nom = nom;
		this.fonction = f;
		this.salaire = s;
	}

	public float getSalaire() {
		return this.salaire;
	}

	@Override
	public String toString() {
		String res;

		res = "Numéro : " + this.num;
		res += "\nNom : " + this.nom;
		res += "\nFonction : " + this.fonction;
		res += "\nSalaire de base : " + this.salaire + " €";

		return res;
	}
}
