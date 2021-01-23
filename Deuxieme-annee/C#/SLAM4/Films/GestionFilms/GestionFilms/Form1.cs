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
    public partial class Form1 : Form
    {
        List<Film> lesFilms;

        public Form1()
        {
            InitializeComponent();
            lesFilms = new List<Film>();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            //Film unFilm;

            // Lecture des lignes
            lireFilms();

            /*unFilm = new Film("1;American Beauty;Drame;DVD");
            lesFilms.Add(unFilm);

            unFilm = new Film("2;Les chevaliers du ciel;Action;TS");
            lesFilms.Add(unFilm);

            unFilm = new Film("3;Fantasia;Dessin animé;DivX");
            lesFilms.Add(unFilm);

            unFilm = new Film("4;Persepolis;Dessin animé;DVD");
            lesFilms.Add(unFilm);

            unFilm = new Film("5;Interstellar;Science fiction;MP4");
            lesFilms.Add(unFilm);

            unFilm = new Film("6;Whiplash;Drame;DVD");
            lesFilms.Add(unFilm);*/

            // Parcours de la collection
            foreach (Film f in lesFilms)
            {
                string ligne = f.Numero + " " + f.Titre + " " + f.Genre + " " + f.Support;
                listeFilms.Items.Add(ligne);
            }

            //MessageBox.Show(getDernierNumero().ToString());

        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
            int i = listeFilms.SelectedIndex;

            lblNomFilm.Text = lesFilms.ElementAt(i).Titre;
            txtNumeroFilm.Text = lesFilms.ElementAt(i).Numero.ToString();
            txtSupportFilm.Text = lesFilms.ElementAt(i).Support;
            txtGenreFilm.Text = lesFilms.ElementAt(i).Genre;

            try
            {
                pictureFilm.Image = Image.FromFile("Affiches/" + lesFilms.ElementAt(i).Titre + ".jpg");
            } catch (Exception ex)
            {
                
            } finally
            {
                pictureFilm.Image = Image.FromFile("Affiches/sans.png");
            }
            
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Form2 f2;

            f2 = new Form2();
            f2.Show();

            f2.setDernierNumero(this.getDernierNumero());

            this.Visible = false;
        }

        public void ajouterFilm(String csv)
        {
            this.Visible = true;

            lesFilms.Add(new Film(csv));
            listeFilms.Items.Clear();

            // Parcours de la collection
            foreach (Film f in lesFilms)
            {
                string ligne = f.Numero + " " + f.Titre + " " + f.Genre + " " + f.Support;
                listeFilms.Items.Add(ligne);
            }
        }

        public int getDernierNumero()
        {
            int numero = -1;

            foreach (Film f in lesFilms)
            {
                if (f.Numero > numero)
                {
                    numero = f.Numero;
                }
            }

            return numero;
        }

        private void lireFilms()
        {
            Film unFilm;

            try
            {
                FileStream fs = new FileStream("C:/films.csv", FileMode.Open, FileAccess.Read);

                StreamReader leFichier = new StreamReader(fs);
                string ligne = leFichier.ReadLine();
            
                while (ligne != null)
                {
                    unFilm = new Film(ligne);
                    lesFilms.Add(unFilm);
                    ligne = leFichier.ReadLine();
                }

                leFichier.Close();
            } catch (Exception ex)
            {
                MessageBox.Show(ex.Message);
            }
            
        }
    }
}
