/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casmomi;

/**
 *
 * @author Anthony
 */
public class Client
{
    // Déclaration des attributs
    private int id;
    private String nom;
    private String email;
    private String portable;
    
    // Constructeur
    public Client(int id, String nom, String email, String portable)
    {
        this.id = id;
        this.nom = nom;
        this.email = email;
        this.portable = portable;
    }

    /*
        Accesseurs
        En lecture
    */
    
    public String getNom() {
        return this.nom;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPortable() {
        return this.portable;
    }
}
