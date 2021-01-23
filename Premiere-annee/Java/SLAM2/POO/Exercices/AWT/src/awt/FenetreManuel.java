/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awt;

import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

/**
 *
 * @author Anthony
 */
public class FenetreManuel extends Frame implements ActionListener, WindowListener
{
    private Label l1;
    private TextField txtNum;
    
    public FenetreManuel()
    {
        super("Création d'un compte");
        this.setLayout(null);
        this.setSize(500, 250);
        this.addWindowListener(this);
        
        this.l1 = new Label("Numéro : ");
        this.l1.setBounds(10, 30, 100, 25);
        this.add(l1);
        
        this.txtNum = new TextField(5);
        this.txtNum.setBounds(110, 30, 100, 25);
        this.add(this.txtNum);
    }
    
}
