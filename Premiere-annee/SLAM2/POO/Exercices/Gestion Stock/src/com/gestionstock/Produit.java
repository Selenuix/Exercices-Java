package com.gestionstock;

public class Produit {
	private String nom;
	private double prix;
	private int stock;

	public Produit(String n, double p) {
		this.nom = n;
		this.prix = p;
		this.stock = 0;
	}

	public Produit(String n, double p, int s) {
		this.nom = n;
		this.prix = p;
		this.stock = s;
	}
}
