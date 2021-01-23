using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace LePoidsIdealV2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void GroupBox1_Enter(object sender, EventArgs e)
        {

        }

        private void Label3_Click(object sender, EventArgs e)
        {

        }

        private void Label4_Click(object sender, EventArgs e)
        {

        }

        private void ListBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void Label6_Click(object sender, EventArgs e)
        {

        }

        private void CmdQuitter_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void CheckListe_CheckedChanged(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void CmdEffacer_Click(object sender, EventArgs e)
        {
            radioFemme.Checked = true;
            txtNom.Clear();
            txtTaille.Clear();
            checkListe.Checked = false;
        }

        private void CmdCalculer_Click(object sender, EventArgs e)
        {
            // Déclaration des varaibles
            int taille;
            double resultat;
            String ligne="Erreur", sexe, nom;

            if (txtTaille.Text == "")
            {
                MessageBox.Show("Attention, la taille doit être renseignée", "Erreur dans la saisie de la taille");
                txtTaille.Focus();
            } else
            {
                // Récupération de la taille après conversion en entier
                taille = Int16.Parse(txtTaille.Text);
                nom = txtNom.Text;

                // Test pour savoir si la taille peut être acceptée
                if (taille >= 140 && taille <= 220)
                {

                    if (radioHomme.Checked)
                    {
                        // Calcul du résultat
                        resultat = (taille - 100) - ((taille - 150) / (4));
                        lblPoids.Text = resultat.ToString() + " kg";
                        sexe = "H";

                        // Si on veut mettre en liste
                        if (checkListe.Checked)
                        {
                            ligne = sexe + "-" + "" + nom.PadRight(10) + " " + taille + " cm" + " --> " + resultat + " Kg";

                        }

                    }
                    else
                    {
                        // Calcul du résultat
                        resultat = (taille - 100) - ((taille - 150) / (2.5));
                        lblPoids.Text = resultat.ToString() + " kg";
                        sexe = "F";
                        // Si on veut mettre en liste
                        if (checkListe.Checked)
                        {
                            ligne = sexe + "-" + "" + nom.PadRight(10) + " " + taille + " cm" + " --> " + resultat + " Kg";
                        }
                    }

                    listPersonnes.Items.Add(ligne);
                }
                else
                {
                    // Affichage du message d'erreur (saisie taille)
                    MessageBox.Show("Attention, la taille doit être comprise entre 140 et 200 cm", "Erreur dans la saisie de la taille");
                    txtTaille.Clear();
                    txtTaille.Focus();
                }
            }
        }

        private void CmdVider_Click(object sender, EventArgs e)
        {
            listPersonnes.Items.Clear();
        }
    }
}
