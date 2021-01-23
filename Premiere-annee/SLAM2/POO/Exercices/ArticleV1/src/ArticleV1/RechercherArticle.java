package ArticleV1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class RechercherArticle extends Frame implements ActionListener, WindowListener
{
	private Label reference;
	private Label libelle;
	private Label prixVente;
	private Label stock;
	private Label valeurStock;
	private Label euro;
	private TextField texteReference;
	private TextField texteLibelle;
	private TextField textePrixVente;
	private TextField texteStock;
	private TextField texteValeurStock;
	private Button boutonRechercher;
	private Button quitter;

	public RechercherArticle()
	{
		// Titre de la fenêtre
		super("Rechercher un article");

		// Mise en place des composants manuellement
		this.setLayout(null);

		// Taille de la fenêtre
		this.setSize(500, 300);

		// Mise à l'écoute de la fenêtre
		this.addWindowListener(this);

		// Ajout des composants

		// Référence
		this.add(reference = new Label("Référence :"));
		this.reference.setBounds(30, 45, 80, 10);
		this.add(texteReference = new TextField());
		this.texteReference.setBounds(140, 40, 120, 20);

		// Recherche
		this.add(boutonRechercher = new Button("Rechercher"));
		this.boutonRechercher.setBounds(270, 40, 70, 20);
		this.boutonRechercher.addActionListener(this);
		this.boutonRechercher.setActionCommand("rechercher");

		// Libellé
		this.add(libelle = new Label("Libellé :"));
		this.libelle.setBounds(30, 100, 80, 10);
		this.add(texteLibelle = new TextField());
		this.texteLibelle.setBounds(140, 100, 210, 20);

		// Prix de vente
		this.add(prixVente = new Label("Prix de vente :"));
		this.prixVente.setBounds(30, 140, 80, 10);
		this.add(textePrixVente = new TextField());
		this.textePrixVente.setBounds(140, 140, 50, 20);
		this.add(euro = new Label("€"));
		this.euro.setBounds(190, 130, 20, 40);

		// Stock
		this.add(stock = new Label("Stock :"));
		this.stock.setBounds(30, 170, 50, 10);
		this.add(texteStock = new TextField());
		this.texteStock.setBounds(140, 170, 50, 20);

		// Valeur du stock
		this.add(valeurStock = new Label("Valeur du stock :"));
		this.valeurStock.setBounds(210, 170, 100, 10);
		this.add(texteValeurStock = new TextField());
		this.texteValeurStock.setBounds(310, 170, 50, 20);
		this.add(euro = new Label("€"));
		this.euro.setBounds(360, 160, 20, 40);

		// Quitter
		this.add(quitter = new Button("Quitter"));
		this.quitter.setBounds(290, 210, 80, 20);
		this.quitter.addActionListener(this);
		this.quitter.setActionCommand("quitter");

	}

	// Réagir aux évènements
	@Override
	public void actionPerformed(ActionEvent evt)
	{
		// Récupération du text renvoyé par le composant
		String action = evt.getActionCommand();

		// StringBuilder
		StringBuilder res = new StringBuilder();

		if (action.equals("rechercher"))
		{
			ArticleDAO test = new ArticleDAO();

			// Récupération de l'article
			Article unArticle = test.getArticleByRef(texteReference.getText());

			// Remplissage des informations
			texteLibelle.setText(unArticle.getRef());
			String prixVente = String.valueOf(unArticle.getPrixVente());
			textePrixVente.setText(prixVente);
			String stock = String.valueOf(unArticle.getStock());
			texteStock.setText(stock);
			String valeurStock = String.valueOf(unArticle.valeurStock());
			texteStock.setText(valeurStock);
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
