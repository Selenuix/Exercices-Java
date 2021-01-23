package com.exercice9;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACISZEK1
 */
	public class Client {
		// Définition des attributs
		private String reference;
		private String nom;
		private String ville;
		private String resultat;
		private float chiffreAffaires;

		// Constructeur
		public Client(String r, String n, String v) {
			this.reference = r;
			this.nom = n;
			this.ville = v;
			this.chiffreAffaires = 0;
		}

		// Constructeur alternatif
		public Client(String r) {
			this.reference = r;
			this.nom = "Anonyme";
			this.ville = "Inconnue";
			this.chiffreAffaires = 0;
		}

		/*
		 * Définition des accesseurs
		 * Lecture
		 */

		// Lecture de référence
		public String getReference() {
			return this.reference;
		}

		// Lecture du nom
		public String getNom() {
			return this.nom;
		}

		// Lecture de la ville
		public String getVille() {
			return this.ville;
		}

		// Lecture du chiffre d'affaire
		public float getChiffreAffaires() {
			return this.chiffreAffaires;
		}

		// Ecriture

		// Ecriture de la ville
		public void setVille(String v) {
			this.ville = v;
		}

		// Ecriture du nom
		public void setNom(String nomClient) {
			this.nom = nomClient;
		}

		// Renvoi des information en String
		public String toString() {
			resultat = "----------------------------------------";
			resultat = resultat + "\nRéférence : " + this.reference;
			resultat = resultat + "\nNom : " + this.nom;
			resultat = resultat + "\nVille : " + this.ville;
			resultat = resultat + "\nChiffre d'affaires : " + this.chiffreAffaires + " €";
			resultat = resultat + "\n----------------------------------------";
			return resultat;
		}

		// Cumuler le chiffre d'affaire
		public void cumulerCa(float ca) {
			this.chiffreAffaires = this.chiffreAffaires + ca;
		}
	}