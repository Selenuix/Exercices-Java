package Exercice10;

import java.util.ArrayList;

public class Film {
	// Attributs
	private String titre;
	private int annee;
	private String realisateur;
	private ArrayList<Acteur> lesActeurs;

	public Film(String title, int year, String director) {
		this.lesActeurs = new ArrayList<Acteur>();
		this.titre = title;
		this.annee = year;
		this.realisateur = director;
	}

	// Méthodes
	@Override
	public String toString() {
		String resultat;

		resultat = this.titre + " (" + this.annee + ")";
		resultat += "\nDe " + this.realisateur;
		resultat += "\nAvec : ";
		for (Acteur unActeur : this.lesActeurs) {
			resultat += "\n\t" + unActeur.getNom() + " " + unActeur.getPrenom();
		}

		return resultat;
	}

	public void ajouterActeur(Acteur acteur) {
		this.lesActeurs.add(acteur);
	}
}
