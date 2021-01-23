/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heritage;

/**
 * @author Anthony
 */
public class Representant extends Salarie {
	private float chiffreAffaires;
	private float frais;

	public Representant(int n, String nom, String f, float s, float ca, float fr) {
		super(n, nom, f, s);
		this.chiffreAffaires = ca;
		this.frais = fr;
	}

	@Override
	public float getSalaire() {
		float tauxCom = 0.04f;
		float fraisRetenus = this.frais;
		float res;

		if (this.chiffreAffaires > 15000f) {
			tauxCom = 400f;
		}

		if (fraisRetenus > 400f) {
			fraisRetenus = 400f;
		}

		res = super.salaire + (super.salaire * tauxCom) + fraisRetenus;
		return res;
	}

	@Override
	public String toString() {
		String res = "\n" + super.toString();

		res += "\nChiffre d'affaire : " + this.chiffreAffaires + " €";
		res += "\nFrais : " + this.frais + " €";
		res += "\nSalaire total : " + this.getSalaire() + " €";

		return res;
	}
}
