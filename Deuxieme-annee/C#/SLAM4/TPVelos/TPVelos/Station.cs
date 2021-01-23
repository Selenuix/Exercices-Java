using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TPVelos
{
    class Station
    {
        // Déclaration des attributs
        private int id;
        private string nom;
        private string latitude;
        private string longitude;
        private int nbPlacesOccupees;
        private int nbPlacesLibres;
        private int nbTotalPlaces;

        // Constructeur
        public Station(int id, string nom, string latitude, string longitude, int nbPlacesOccupees, int nbPlacesLibres, int nbTotalPlaces)
        {
            this.id = id;
            this.nom = nom;
            this.latitude = latitude;
            this.longitude = longitude;
            this.nbPlacesOccupees = nbPlacesOccupees;
            this.nbPlacesLibres = nbPlacesLibres;
            this.nbTotalPlaces = nbTotalPlaces;
        }

        // Récupération de l'id de la station
        public int GetId()
        {
            return this.id;
        }

        // Récupération du nom de la station
        public string GetNom()
        {
            return this.nom;
        }

        // Renvoi des informations
        override
        public string ToString()
        {
            string res = this.GetNom();

            res += "\nIdentifiant : " + this.id;
            res += "\nLatitude : " + this.latitude;
            res += "\nLongitude : " + this.longitude;
            res += "\nNombre total de places : " + this.nbTotalPlaces;
            res += "\nNombre de places libres : " + this.nbPlacesLibres;
            res += "\nNombre de places occupées : " + this.nbPlacesOccupees;

            return res;
        }
    }
}
