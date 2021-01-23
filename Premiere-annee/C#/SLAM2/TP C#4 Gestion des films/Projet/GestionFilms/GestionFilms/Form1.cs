using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace GestionFilms
{
    public partial class Form1 : Form
    {
        private List<String> lesFilms;
        private List<String> laSelection;

        public Form1()
        {
            InitializeComponent();
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {
            lesFilms = new List<String>();
            String unFilm;

            unFilm = "1;American Beauty;Drame;DVD";
            lesFilms.Add(unFilm);

            unFilm = "2;Les chevaliers du ciel;Action;TS";
            lesFilms.Add(unFilm);

            unFilm = "3;Fantasia;Dessin animé;DivX";
            lesFilms.Add(unFilm);

            unFilm = "4;Persepolis;Dessin animé;DVD";
            lesFilms.Add(unFilm);

            unFilm = "5;Interstellar;Science fiction;MP4";
            lesFilms.Add(unFilm);

            unFilm = "6;Whiplash;Drame;DVD";
            lesFilms.Add(unFilm);
        }
    }
}
