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

        public Film(String csv)
        {
            String[] infos;

            infos = csv.Split(';');
            this.numero = Int32.Parse(infos[0]);
            this.titre = infos[1];
            this.genre = infos[2];
            this.genre = infos[3];
        }

        public String toCSV()
        {
            String infos;

            infos = this.numero + ";" + this.titre + ";" + this.genre + ";" + this.support;

            return infos;
        }

        public int getNumero()
        {
            return this.numero;
        }

        public String getSupport()
        {
            return this.support;
        }

        public String getGenre()
        {
            return this.genre;
        }

    }
}
