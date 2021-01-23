using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SHOM
{
    class Carte
    {
        // Déclaration des attributs
        private List<Port> lesPorts;
        private List<string> lesPays;

        // Constructeur
        public Carte()
        {
            this.lesPorts = new List<Port>();
            this.lesPays = new List<string>();
        }

        // Ajout d'un port sur la carte
        public void ajouterPort(string identifiant, string nom, string pays, string codeFuseauHoraire)
        {
            Port unPort = new Port(identifiant, nom, pays, codeFuseauHoraire);
            this.lesPorts.Add(unPort);
        }
        public void ajouterPays(string pays)
        {
            if (!lesPays.Contains(pays))
            {
                lesPays.Add(pays);
            }
        }

        // Récupération d'un port
        public Port GetLePort(int index)
        {
            Port lePort = null;

            if(index < this.lesPorts.Count())
            {
                lePort = this.lesPorts.ElementAt(index);
            }

            return lePort;
        }

        public List<Port> GetLesPorts()
        {
            return this.lesPorts;
        }

        // Récupération du nombre de ports
        public int nbPorts()
        {
            return lesPorts.Count();
        }

        public List<string> GetLesPays()
        {
            return this.lesPays;
        }
    }
}
