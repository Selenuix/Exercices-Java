package com.exercice.exercicecollection;

import java.util.ArrayList;

public class ExerciceCollection {
	public static void main(String args[]) {
		// Déclaration de la collection
		ArrayList<String> lesFruits;

		// Instanciation de la collection
		lesFruits = new ArrayList<String>();

		// Ajout d'objets String dans la collection
		lesFruits.add("Pomme");
		lesFruits.add("Orange");
		lesFruits.add("Banane");
		lesFruits.add("Noix");
		lesFruits.add("Pomme");
		lesFruits.add("Kiwi");
		lesFruits.add("Kaki");
		lesFruits.add("Mandarine");

		// Parcours de la collection du début à la fin
		for (String unFruit : lesFruits) {
			System.out.print(unFruit + " - ");
		}
	}
}
