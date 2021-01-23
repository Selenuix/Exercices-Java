package ArticleV1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class NouvelArticle extends Frame implements ActionListener, WindowListener
{
	// Composants
	private Label reference;
	private Label libelle;
	private Label prixVente;
	private Label euro;
	private Label stock;
	private TextField texteReference;
	private TextField texteLibelle;
	private TextField textePrixVente;
	private TextField texteStock;
	private Button valider;

	public NouvelArticle()
	{
		// Titre de la fenêtre
		super("Nouvel article");

		// Mise en place des composants manuellement
		this.setLayout(null);

		// Taille de la fenêtre
		this.setSize(500, 300);

		// Mise à l'écoute de la fenêtre
		this.addWindowListener(this);

		// Ajout des composants

		// Référence
		this.add(reference = new Label("Référence :"));
		this.reference.setBounds(30, 50, 70, 10);
		this.add(texteReference = new TextField());
		this.texteReference.setBounds(115, 45, 120, 20);

		// Libellé
		this.add(libelle = new Label("Libellé : "));
		this.libelle.setBounds(30, 80, 70, 10);
		this.add(texteLibelle = new TextField());
		this.texteLibelle.setBounds(115, 80, 180, 20);

		// Prix de vente
		this.add(prixVente = new Label("Prix de vente :"));
		this.prixVente.setBounds(30, 115, 80, 10);
		this.add(textePrixVente = new TextField());
		this.textePrixVente.setBounds(115, 115, 50, 20);
		this.add(euro = new Label("€"));
		this.euro.setBounds(170, 115, 40, 20);

		// Stock
		this.add(stock = new Label("Stock :"));
		this.stock.setBounds(30, 150, 80, 10);
		this.add(texteStock = new TextField());
		this.texteStock.setBounds(115, 150, 40, 20);

		// Valider
		this.add(valider = new Button("Valider"));
		this.valider.setBounds(210, 175, 80, 20);
		this.valider.addActionListener(this);
		this.valider.setActionCommand("valider");
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

		// Quitter le programme
		if(action.equals("quitter"))
		{
			System.exit(0);
		}

		if(action.equals("valider"))
		{
			// Déclaration des objets
			ArticleDAO test = new ArticleDAO();
			Article articleAAjouter;

			// Déclaration des variables
			String ref, libelle;
			float prixVente;
			int stock;

			// Récupération des infos
			ref = texteReference.getText();
			libelle = texteLibelle.getText();
			prixVente =  Float.parseFloat(textePrixVente.getText());
			stock = Integer.parseInt(texteStock.getText());

			// Création de l'article
			articleAAjouter = new Article(ref, libelle, prixVente, stock);

			// Ajout de l'article à la liste
			test.ajouterArticle(articleAAjouter);

			// Retour à l'acceuil
			GestionArticles ga = new GestionArticles();
			this.setVisible(false);
			ga.setVisible(true);

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
