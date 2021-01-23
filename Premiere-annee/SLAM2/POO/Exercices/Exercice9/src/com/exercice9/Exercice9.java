package com.exercice9;

import java.util.ArrayList;

public class Exercice9 {
	public static void main(String[] args) {
		// Déclaration de la collection
		ArrayList<Client> lesClients;
		Client client1, client2, client3, client4, client5;

		// Instanciation de la collection
		lesClients = new ArrayList<Client>();

		// Instanciation des clients
		client1 = new Client("CLI1", "Phébus", "Thann");
		client2 = new Client("CLI2", "Vincent", "Soultzmatt");
		client3 = new Client("CLI3", "Vincent", "Colmar");
		client4 = new Client("CLI4", "Yll", "Mulhouse");
		client5 = new Client("CLI5", "Anthony", "Helfrantzkirch");

		// Ajout des clients
		lesClients.add(client1);
		lesClients.add(client2);
		lesClients.add(client3);
		lesClients.add(client4);
		lesClients.add(client5);

		// Parcours de la collection
		for (Client unClient : lesClients) {
			System.out.print(unClient.getNom() + " - ");
		}

		System.out.println("\n");

		// Affichage du nombre de clients
		System.out.print(lesClients.size() + " clients");

		System.out.println("\n");

		// Parcours de la collection
		for (int i = 0; i < lesClients.size(); i++) {
			System.out.print(lesClients.get(i).getNom() + " - ");
		}

		// Recherche de Anthony
		boolean anthony = false;
		for (Client unClient : lesClients) {
			if (unClient.getNom().equals("Anthony")) {
				anthony = true;
			}
		}

		if(anthony) {
			System.out.println("Oui");
		} else {
			System.out.println("Non");
		}

		// Suppression d'un client
		lesClients.remove(2);

		// Parcours de la collection avec un foreach
		for (Client unClient : lesClients) {
			System.out.print(unClient.getNom() + " - ");
		}

		// Vidage des clients
		lesClients.clear();

		// Parcours de la collection avec un foreach
		for (Client unClient : lesClients) {
			System.out.print(unClient.getNom() + " - ");
		}
	}

}
