package CasFret;

public class FretRoutier extends Fret
{
	// Constructeur
	public FretRoutier(String villeDepart, String villeArrivee, int duree, int distance, TypeVehicule leTypeVehicule)
	{
		super(villeDepart, villeArrivee, duree, distance, leTypeVehicule);
	}

	// Implémentation des méthodes obligatoires

	// Calcul du prix
	public float calculerPrix()
	{
		// Déclaration des variables
		float poidsVolumetrique, prix;

		// Calcul du poids volumétrique
		poidsVolumetrique = (super.calculerPoidsTotal() * 3);

		// Comparaison du volume déclaré et du poids volumétrique
		if(poidsVolumetrique > super.calculerPoidsTotal())
		{
			prix = poidsVolumetrique * Tarif.ROUTIER;
		} else
		{
			prix = super.calculerVolumetotal() * Tarif.ROUTIER;
		}

		// Retour de la valeur
		return prix;
	}

	// Calcul de l'empreinte carbone
	public float calculerEmpreinteCarbone()
	{
		// Déclaration des variables
		float empreinteCarbone;

		// Calcul de l'empreinte carbone
		empreinteCarbone = super.getLeTypeVehicule().getTauxConsoKm() * super.getDistance() * FacteurEmission.ROUTIER * (super.calculerVolumetotal() / super.getLeTypeVehicule().getVolumeMax());

		// Retour de la valeur
		return empreinteCarbone;
	}

	@Override
	public String toString()
	{
		// Déclaration des variables
		String res = "";

		// Construction de la chaîne
		res += "\n##################################################################";
		res += "\n\t\tFret routier";
		res += "\nVille départ : " + super.getVilleDepart();
		res += "\nVille arrivée : " + super.getVilleArrivee();
		res += "\nDistance : " + super.getDistance() + " km";
		res += "\nDurée : " + super.getDuree() + " jour(s)";
		res += "\nTransporté par : " + super.getLeTypeVehicule().getLibelle() + " " + super.getLeTypeVehicule().getVolumeMax() + " m3";
		res += "\n-----------------Liste des marchandises-----------------";
			for(Lot unLot : super.getLesLots())
			{
				res += "\n" + unLot.getLaMarchandise().getId() + "\t" + unLot.getLaMarchandise().getLibelle() + "\t" +
						unLot.getPoids() + "t " + unLot.getVolume() + "m3" + " (" + unLot.getLaMarchandise().getPrecautions() + ")";
			}
		res += "\n--------------------------------------------------------";
		res += "\n\tPoids total : " + super.calculerPoidsTotal() + " tonnes";
		res += "\n\tVolume total : " + super.calculerVolumetotal() + " m3";
		res += "\n\tPrix du fret : " + calculerPrix() + " €";
		res += "\nEmpreinte carbone : " + calculerEmpreinteCarbone() + " kg de co2";
		res += "\n\n##################################################################";

		return res;
	}
}
