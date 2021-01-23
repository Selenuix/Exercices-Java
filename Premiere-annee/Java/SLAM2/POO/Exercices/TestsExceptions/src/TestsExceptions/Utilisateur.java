package TestsExceptions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilisateur
{
	private String login;
	private String motDePasse;
	private String nom;
	private String prenom;
	private String mel;

	public Utilisateur(String login, String nom, String prenom)
	{
		this.login = login;
		this.nom = nom;
		this.prenom = prenom;
		this.mel = "";
		this.motDePasse = "azertyuiop";
	}

	public void setMotDePasse(String nouveau) throws MotDePasseException
	{
		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^+=])(?=\\S+$).{8,}$";
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(nouveau);

		if(!m.matches())
		{
			throw new MotDePasseException("Mot de passe non conforme !");
		} else
		{
			this.motDePasse = nouveau;
		}
	}

	public void setMel(String nouveau) throws MelException
	{
		String regex = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(nouveau);

		if(!m.matches())
		{
			throw new MelException("Mauvais format de mail !");
		} else
		{
			this.mel = nouveau;
		}

	}

	@Override
	public String toString()
	{
		String res = "Mel : " + this.mel;

		return res;
	}
}
