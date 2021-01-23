using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TPVelos
{
    class Carte
    {
        // Déclaration des attributs
        private List<Station> lesStations;

        // Constructeur
        public Carte()
        {
            this.lesStations = new List<Station>();
        }

        // Ajout d'une station sur la carte
        public void ajouterStation(int id, string nom, string latitude, string longitude, int nbPlacesOccupees, int nbPlacesLibres, int nbTotalPlaces)
        {
            Station uneStation = new Station(id, nom, latitude, longitude, nbPlacesOccupees, nbPlacesLibres, nbTotalPlaces);
            this.lesStations.Add(uneStation);
        }

        // Récupération d'une station
        public Station GetLaStation(int index)
        {
            Station laStation = null;

            if(index < this.lesStations.Count())
            {
                laStation = this.lesStations.ElementAt(index);
            }

            return laStation;
        }

        // Récupération du nombre de stations
        public int nbStation()
        {
            return lesStations.Count();
        }
    }
}
