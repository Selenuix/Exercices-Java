using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace TPVelos
{
    public partial class Form1 : Form
    {
        Carte uneCarte;

        public Form1()
        {
            InitializeComponent();
            uneCarte = Passerelle.getCarte();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            for (int i = 0; i < uneCarte.nbStation(); i++)
            {
                dataGridView1.Rows.Add(uneCarte.GetLaStation(i).GetNom());
            }
        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            // Recherche de l'index
            int indexSelectionne = dataGridView1.CurrentCell.RowIndex;

            // Affichage des informations
            MessageBox.Show(uneCarte.GetLaStation(indexSelectionne).ToString());
        }
    }
}
