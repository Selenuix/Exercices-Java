package td.commande;

public class TDCommande {
	public static void main(String[] args) {
		// Déclaration des objets et variables
		Client Client1;
		Commande Commande1;
		LigneCommande LigneTest;
		Article unArticle;

		// Instanciation du client
		Client1 = new Client("1", "CISZEK", "Colmar");

		// Instanciation de la commande
		Commande1 = new Commande("CM1", "04/02/2020", Client1);

		unArticle = new Article("V1", "VTT", 300, 350, 1);

		// Ajout des lignes de commandes
		LigneTest = new LigneCommande(300, unArticle);

		System.out.println(LigneTest.toString());
	}
}
