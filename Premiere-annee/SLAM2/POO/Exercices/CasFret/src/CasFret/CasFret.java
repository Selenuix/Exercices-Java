package CasFret;

public class CasFret {
	public static void main(String[] args) {
		// Déclaration des objets
		Fret fretRoutier, fretMaritime, fretAerien;
		TypeVehicule vehicule1, vehicule2, vehicule3;
		Marchandise marchandise1, marchandise2, marchandise3;

		// Instanciation des véhicules et du fret
		vehicule1 = new TypeVehicule("Camion remorque", 0.32f, 40);
		vehicule2 = new TypeVehicule("Porte conteneur", 61.32f, 43000);
		vehicule3 = new TypeVehicule("Avion cargo", 32.0f, 874);
		fretRoutier = new FretRoutier("Brest", "Marseille", 1, 1250, vehicule1);
		fretMaritime = new FretMaritime("Brest", "Marseille", 5, 3333, vehicule2);
		fretAerien = new FretAerien("Brest", "Marseille", 1, 930, vehicule3);

		// Instanciation des marchandises
		marchandise1 = new Marchandise(1, "Pommes de terre", "température ambiante");
		marchandise2 = new Marchandise(2, "Artichaut du Léon", "fragile");
		marchandise3 = new Marchandise(3, "Oignons de Roscoff", "pas de choc");

		// Ajout des machandises au fret routier
		fretRoutier.ajouterLot(marchandise1, 1, 2.0f, 1.0f);
		fretRoutier.ajouterLot(marchandise2, 2, 0.5f, 2.0f);
		fretRoutier.ajouterLot(marchandise3, 3, 0.7f, 0.9f);

		// Ajout des machandises au fret maritime
		fretMaritime.ajouterLot(marchandise1, 1, 2.0f, 1.0f);
		fretMaritime.ajouterLot(marchandise2, 2, 0.5f, 2.0f);
		fretMaritime.ajouterLot(marchandise3, 3, 0.7f, 0.9f);

		// Ajout des machandises au fret aérien
		fretAerien.ajouterLot(marchandise1, 1, 2.0f, 1.0f);
		fretAerien.ajouterLot(marchandise2, 2, 0.5f, 2.0f);
		fretAerien.ajouterLot(marchandise3, 3, 0.7f, 0.9f);

		System.out.print(fretRoutier.toString());
		System.out.print(fretMaritime.toString());
		System.out.print(fretAerien.toString());
	}
}
