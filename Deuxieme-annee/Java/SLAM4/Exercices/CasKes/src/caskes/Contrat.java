package caskes;

import java.util.ArrayList;

public class Contrat
{
	// Déclaration des attributs
	private int numero;
	private String date;
	private float montantContrat;
	private Client leClient;
	private ArrayList<Intervention> lesInterventions;

	// Constructeur
	public Contrat(int numero, String date, float montantContrat) {
		this.numero = numero;
		this.date = date;
		this.montantContrat = montantContrat;
		this.lesInterventions = new ArrayList<>();
	}

	// Accesseur en lecture
	public float getMontantContrat() {
		return montantContrat;
	}

	// Détermination et retour de l’écart entre le montant du contrat
	// et le coût des interventions effectuées sur ce contrat
	public float ecart()
	{
		float ecart = getMontantContrat();

		for (Intervention uneIntervention : lesInterventions) {
			ecart += uneIntervention.fraisMo();
		}

		return ecart;
	}
}
