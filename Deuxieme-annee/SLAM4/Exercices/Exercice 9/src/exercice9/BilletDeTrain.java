package exercice9;

public class BilletDeTrain
{
	private final String destination;
	private float sommeVersee;
	private final float prix;

	public BilletDeTrain(String destination, float prix)
	{
		this.destination = destination;
		this.prix = prix;
		this.sommeVersee = 0;
	}

	public void encaisser(float somme)
	{
		this.sommeVersee += somme;

		if (this.sommeVersee >= this.prix)
		{
			System.out.println(editer());
		}
	}

	private String editer()
	{
		float aRendre = 0;

		if (this.sommeVersee > this.prix)
		{
			aRendre = this.sommeVersee - this.prix;
		}

		String edit = "Destination : " + this.destination;
		edit += "\nPrix : " + this.prix + " €";
		edit += "\nSomme versée : " + this.sommeVersee + " €";
		edit += "\nSomme rendue : " + aRendre + " €";

		return edit;
	}

	public String annuler()
	{
		String res = "Opération annulée";
		res += "\nSomme rendue : " + this.sommeVersee + " €";

		return res;
	}
}
