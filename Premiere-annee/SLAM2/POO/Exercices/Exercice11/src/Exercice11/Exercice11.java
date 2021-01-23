package Exercice11;

/**
 * @author ACISZEK1
 */
public class Exercice11 {
	public static void main(String[] args) {
		Commande commande1;
		Client client1;
		Article article1, article2;
		LigneCommande l1, l2;

		client1 = new Client("cl", "Coltrane", "Colmar");

		commande1 = new Commande("1234", "12/02/2020", client1);

		article1 = new Article("V1", "VTT", 200, 300, 10);
		article2 = new Article("V2", "VTC", 200, 250, 5);

		l1 = new LigneCommande(1,  article1);
		l2 = new LigneCommande(2,  article2);

		commande1.ajouterLigne(l1);
		commande1.ajouterLigne(l2);

		System.out.println(commande1.toString());

	}
}
