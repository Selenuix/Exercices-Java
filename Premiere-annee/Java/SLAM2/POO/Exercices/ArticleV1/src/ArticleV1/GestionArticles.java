package ArticleV1;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GestionArticles extends Frame implements ActionListener, WindowListener
{
	// Attributs privés
	private Button afficherArticles;
	private Button rechercherArticle;
	private Button nouvelArticle;
	private Button quitter;

	// Constructeur
	public GestionArticles() {
		// Titre de la fenêtre
		super("Gestion des articles");

		// Mise en place des composants manuellement
		this.setLayout(null);

		// Taille de la fenêtre
		this.setSize(500, 300);

		// Mise à l'écoute de la fenêtre
		this.addWindowListener(this);

		// Ajout des boutons de commande

		// Text du bouton
		this.add(afficherArticles = new Button("Afficher les articles"));
		// Placement du bouton
		this.afficherArticles.setBounds(200,50,130,45);
		// Mise à l'écoute du bouton
		this.afficherArticles.addActionListener(this);
		// Renvoi du texte lors du clic
		this.afficherArticles.setActionCommand("afficherArticles");

		this.add(rechercherArticle = new Button("Rechercher un article"));
		this.rechercherArticle.setBounds(200,100,130,45);
		this.rechercherArticle.addActionListener(this);
		this.rechercherArticle.setActionCommand("rechercherArticle");

		this.add(nouvelArticle = new Button("Nouvel article"));
		this.nouvelArticle.setBounds(200,150,130,45);
		this.nouvelArticle.addActionListener(this);
		this.nouvelArticle.setActionCommand("nouvelArticle");

		this.add(quitter = new Button("Quitter"));
		this.quitter.setBounds(200,200,130,45);
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

			// Réaction au clic
			if(action.equals("afficherArticles"))
			{
				// Création de la fenêtre
				AfficherArticles aa = new AfficherArticles();

				// Afficher la fenêtre "afficherArticle"
				this.setVisible(false);
				aa.setVisible(true);
			}

			// Fenêtre "rechercherArticle"
			if(action.equals("rechercherArticle"))
			{
				// Création de la fenêtre
				RechercherArticle ra = new RechercherArticle();

				// Afficher la fenêtre "afficherArticle"
				this.setVisible(false);
				ra.setVisible(true);
			}

			// Fenêtre "nouvelArticle"
			if(action.equals("nouvelArticle"))
			{
				// Création de la fenêtre
				NouvelArticle na = new NouvelArticle();

				// Afficher la fenêtre "afficherArticle"
				this.setVisible(false);
				na.setVisible(true);
			}

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
