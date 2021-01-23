package TestsExceptions;

public class TestsExceptions {
	public static void main(String[] args) {
		Utilisateur u;

		u = new Utilisateur("JC", "Coltrane", "John");
		System.out.println(u.toString());

		try {
			u.setMel("afeRGGRazZ@..com");
		}
		catch (MelException me)
		{
			System.out.println(me.getMessage());
		}
		System.out.println(u.toString());

		try {
			u.setMel("anthony.ciszek@outlook.com");
		}
		catch (MelException me) {
			System.out.println(me.getMessage());
		}
		System.out.println(u.toString());
	}
}
