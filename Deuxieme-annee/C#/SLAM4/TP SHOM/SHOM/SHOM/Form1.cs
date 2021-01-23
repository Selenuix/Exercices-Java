using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace SHOM
{
    public partial class formPrincipal : Form
    {
        Carte uneCarte;
        List<Port> selection;

        public formPrincipal()
        {
            uneCarte = Passerelle.getCarte();
            selection = new List<Port>();
            InitializeComponent();
        }

        private void formPrincipal_Load(object sender, EventArgs e)
        {
            foreach (string pays in uneCarte.GetLesPays())
            {
                comboBox1.Items.Add(pays);
            }
        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            // Recherche de l'index
            int indexSelectionne = dataGridView1.CurrentCell.RowIndex;

            // Affichage des informations
            MessageBox.Show(selection.ElementAt(indexSelectionne).ToString());
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            dataGridView1.Rows.Clear();
            selection.Clear();

            foreach (Port unPort in uneCarte.GetLesPorts())
            {
                if (unPort.GetPays() == comboBox1.SelectedItem.ToString())
                {
                    dataGridView1.Rows.Add(unPort.GetIdentifiant(), unPort.GetNom());
                    selection.Add(unPort);
                }
            }
        }
    }
}
