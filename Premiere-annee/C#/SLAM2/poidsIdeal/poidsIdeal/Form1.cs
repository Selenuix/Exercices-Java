using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace poidsIdeal
{
    public partial class frmPoidsIdeal : Form
    {
        public frmPoidsIdeal()
        {
            InitializeComponent();
        }

        private void Label1_Click(object sender, EventArgs e)
        {

        }

        private void FrmPoidsIdeal_Load(object sender, EventArgs e)
        {

        }

        private void CmdCalculer_Click(object sender, EventArgs e)
        {
            // Déclaration des varaibles
            int taille;
            char sexe;
            double resultat;

            // Récupération de la taille après conversion en entier
            taille = Int16.Parse(txtTaille.Text);

            // Test pour savoir si la taille peut être acceptée
            if(taille >= 140 && taille <= 220)
            {
                // Récupération du caractère f ou m
                sexe = Char.Parse(txtSexe.Text);

                switch (sexe)
                {
                    case 'f':
                        // Calcul du résultat
                        resultat = (taille - 100) - ((taille - 150) / (2.5));
                        lblPoids.Text = resultat.ToString() + " kg";
                        break;
                    case 'm':
                        // Calcul du résultat
                        resultat = (taille - 100) - ((taille - 150) / (4));
                        lblPoids.Text = resultat.ToString() + " kg";
                        break;
                    default:
                        // Affichage du message d'erreur si la saisie est incorrecte
                        MessageBox.Show("Erreur de saisie du sexe (f ou m)", "Erreur dans la saisie du sexe");
                        break;
                }
            } else
            {
                // Affichage du message d'erreur (saisie taille)
                MessageBox.Show("Attention, la taille doit être comprise entre 140 et 200 cm", "Erreur dans la saisie de la taille");
                txtTaille.Clear();
                txtTaille.Focus();
            }
        }

        private void CmdEffacer_Click(object sender, EventArgs e)
        {
            // Effacer les textBox
            txtSexe.Clear();
            txtTaille.Clear();
            lblPoids.Text = "0.0 kg";
            txtTaille.Focus();
        }

        private void CmdQuitter_Click(object sender, EventArgs e)
        {
            // Quitter le programme
            this.Close();
        }

        private void Label2_Click(object sender, EventArgs e)
        {

        }


        private void TxtTaille_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
