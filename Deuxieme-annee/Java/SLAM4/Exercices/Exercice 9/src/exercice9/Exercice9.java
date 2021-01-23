package exercice9;

public class Exercice9
{
	public static void main(String[] args)
	{
		// Déclaration des objets
		BilletDeTrain billet1;

		// Instanciation des objets
		billet1 = new BilletDeTrain("Paris", 23.0f);

		// Payement du billet
		billet1.encaisser(3.0f);
		billet1.encaisser(20.0f);

		System.out.println(billet1.annuler());
	}

}
