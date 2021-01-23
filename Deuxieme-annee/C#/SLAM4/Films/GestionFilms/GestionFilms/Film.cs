using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GestionFilms
{
    class Film
    {
        private int numero;
        private String titre;
        private String genre;
        private String support;

        // Constructeur
        public Film(string csv)
        {
            string[] temp = csv.Split(';');

            this.numero = int.Parse(temp[0]);
            this.titre = temp[1];
            this.genre = temp[2];
            this.support = temp[3];
        }

        public int Numero { get => numero; set => numero = value; }
        public string Titre { get => titre; set => titre = value; }
        public string Genre { get => genre; set => genre = value; }
        public string Support { get => support; set => support = value; }

        public String toCSV()
        {
            return this.Numero + ";" + this.Titre + ";" + this.Genre + ";" + this.Support;
        }

    }
}
