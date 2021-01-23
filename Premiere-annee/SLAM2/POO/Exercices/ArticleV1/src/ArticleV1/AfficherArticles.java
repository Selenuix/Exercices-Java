package ArticleV1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AfficherArticles extends Frame implements ActionListener, WindowListener
{
	// Composants
	private List listeArticles;
	private Button quitter;

	// Constructeur
	public AfficherArticles()
	{
		// Titre de la fenêtre
		super("Afficher les articles");

		// Mise en place des composants manuellement
		this.setLayout(null);

		// Taille de la fenêtre
		this.setSize(500, 300);

		// Mise à l'écoute de la fenêtre
		this.addWindowListener(this);

		// Ajout des composants

		// Ajout des la liste
		this.add(listeArticles = new List(4, false));
		listeArticles.setBounds(20, 50, 450, 180);
		listeArticles.addActionListener(this);

		// Ajout du bouton
		this.add(quitter = new Button("Quitter"));
		this.quitter.setBounds(400, 250, 70, 30);
		this.quitter.addActionListener(this);
		this.quitter.setActionCommand("quitter");
	}

	// Implémentation des méthodes obligatoires

	// Réagir aux évènements
	@Override
	public void actionPerformed(ActionEvent evt)
	{
		// Récupération du text renvoyé par le composant
		String action = evt.getActionCommand();

		// StringBuilder
		StringBuilder res = new StringBuilder();

		// Récupération des articles
		ArticleDAO test = new ArticleDAO();

		for (Article unArticle : test.getLesArticles())
		{
			listeArticles.add(unArticle.toString());
		}

		// Réaction au clic
		if(action.equals("quitter"))
		{
			// Quitter le programme
			System.exit(0);
		}
	}

	//Réagir à l'évènement "fermeture de la fenêtre"
	@Override
	public void windowClosed(WindowEvent event){}

	//Réagir à l'évènement "desiconisation de la fenêtre"
	@Override
	public void windowDeiconified(WindowEvent event){}

	//Réagir à l'évènement "iconisation de la fenêtre"
	@Override
	public void windowIconified(WindowEvent event){}

	//Réagir à l'évènement "activation de la fenêtre"
	@Override
	public void windowActivated(WindowEvent event){}

	//Réagir à l'évènement "desactivation de la fenêtre"
	@Override
	public void windowDeactivated(WindowEvent event){}

	//Réagir à l'évènement "ouverture de la fenêtre"
	@Override
	public void windowOpened(WindowEvent event){}

	//Réagir à l'évènement "fermeture de la fenêtre"
	@Override
	public void windowClosing(WindowEvent event){
		System.exit(0);
	}
}
