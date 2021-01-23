using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;

namespace GestionFilms
{
    public partial class Form2 : Form
    {
        private int dernierNumero;

        public Form2()
        {
            InitializeComponent();
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            txtNumero.Clear();
            txtTitre.Clear();
            txtGenre.Clear();
            cboSupport.Text = "DivX";
        }

        private void Form2_Load(object sender, EventArgs e)
        {
            // MessageBox.Show(this.dernierNumero.ToString());
            // txtNumero.Text = this.dernierNumero.ToString();
            cboSupport.Items.AddRange(new string[] { "DivX", "DVD", "Blue Ray", "MP4", "TS", "AVI"});
            cboSupport.Text = "DivX";
        }

        private void button2_Click(object sender, EventArgs e)
        {
            ecrireFilm();
        }

        public void setDernierNumero(int num)
        {
            this.dernierNumero = num;
        }

        public void ecrireFilm()
        {
            FileStream fs = new FileStream("C:/films.csv", FileMode.Append, FileAccess.Write);

            StreamWriter leFichier = new StreamWriter(fs);

            // Création du CSV des infos
            String csv = "\n" + Int32.Parse(txtNumero.Text) + ";" + txtTitre.Text + ";" + txtGenre.Text + ";" + cboSupport.Text;

            leFichier.WriteLine(csv);
            leFichier.Close();

            this.Close();
        }
    }
}
