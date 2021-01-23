/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awt;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;


/**
 *
 * @author Anthony
 */
public class FenetrePrincipale extends Frame implements ActionListener, WindowListener
{
    // Création des composants
    private TextField txtNom;
    private Choice cboFruits;
    private Button cmdPrefere, cmdDeteste;
    private Label lblResultat;
    
    // Consutructeur
    public FenetrePrincipale()
    {
        super("Une interface graphique simple");
        
        // Paramétrage du layout
        this.setLayout(new FlowLayout());
        this.setSize(800, 220);
        this.addWindowListener(this);
        
        // Ajout de la TextBox
        this.add(new Label("Saisir le nom : "));
        this.add(txtNom = new TextField(10));
        
        // Ajout de la combo
        this.add(new Label("Fruit : "));
        add(cboFruits = new Choice());
        this.cboFruits.addItem("Noisettes");
        this.cboFruits.addItem("Bananes");
        this.cboFruits.addItem("Pommes");
        this.cboFruits.addItem("Kiwis");
        
        // Ajout des boutons de commande
        this.add(cmdPrefere = new Button("Préfère"));
        this.cmdPrefere.addActionListener(this);
        this.cmdPrefere.setActionCommand("actionSiPrefere");
        
        this.add(cmdDeteste = new Button("Déteste"));
        this.cmdDeteste.addActionListener(this);
        this.cmdDeteste.setActionCommand("actionSiDeteste");
        
        // Ajout du label
        String VIDE = "                         ";
        this.add(lblResultat = new Label(VIDE));
    }
    
    // Implémentation des méthodes publiques
    @Override
    public void actionPerformed(ActionEvent evt)
    {
        // Récupération du texte renvoyé
        String action = evt.getActionCommand();
        
        // StringBuilder
        StringBuilder res = new StringBuilder();
        
        // Réaction si préfère
        if(action.equals("actionSiPrefere"))
        {
            // Concaténation
            res.append(txtNom.getText());
            res.append(" préfère les ");
            res.append(cboFruits.getSelectedItem());
            
            // Valorisation du résultat
            lblResultat.setText(res.toString());
        }
        
        // Réaction si déteste
        if(action.equals("actionSiDeteste"))
        {
            // Concaténation
            res.append(txtNom.getText());
            res.append(" déteste les ");
            res.append(cboFruits.getSelectedItem());
            
            // Valorisation du résultat
            lblResultat.setText(res.toString());
        }
    }
    
    // Implémentation des méthodes obligatoires
    
    // Fermeture de la fenêtre
    @Override
    public void windowClosed(WindowEvent event) {}
    
    // Désiconisation de la fenêtre
    @Override
    public void windowDeiconified(WindowEvent event) {}
    
    // Iconisation de la fenêtre
    @Override
    public void windowIconified(WindowEvent event){}

    // Activation de la fenêtre
    @Override
    public void windowActivated(WindowEvent event){}
    
    // Désactivation de la fenêtre
    @Override
    public void windowDeactivated(WindowEvent event){}
    
    // Ouverture de la fenêtre
    @Override
    public void windowOpened(WindowEvent event){}
    
    // Fermeture de la fenêtre
    @Override
    public void windowClosing(WindowEvent event)
    {
        System.exit(0);
    }

}
