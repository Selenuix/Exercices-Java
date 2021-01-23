package Exercice10;

/**
 * @author ACISZEK1
 */
public class Exercice10 {
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Film lesFilms;

		lesFilms = new Film("AMERICAN BEAUTY", 1999, "Sam Mendez");

		lesFilms.ajouterActeur(new Acteur("Kevin", "Spacey"));
		lesFilms.ajouterActeur(new Acteur("Annette", "Bening"));
		lesFilms.ajouterActeur(new Acteur("Thora", "Birch"));
		lesFilms.ajouterActeur(new Acteur("Wes", "Bentley"));

		System.out.println(lesFilms.toString());
	}
}
