using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SHOM
{
    class Port
    {
        // Déclaration des attributs
        private string identifiant;
        private string nom;
        private string pays;
        private string codeFuseauHoraire;

        public Port(string identifiant, string nom, string pays, string codeFuseauHoraire)
        {
            this.identifiant = identifiant;
            this.nom = nom;
            this.pays = pays;
            this.codeFuseauHoraire = codeFuseauHoraire;
        }

        public string GetIdentifiant()
        {
            return this.identifiant;
        }

        public string GetNom()
        {
            return this.nom;
        }

        public string GetPays()
        {
            return this.pays;
        }
        public override string ToString()
        {
            string res = "Identifiant : " + this.identifiant;

            res += "\nNom : " + this.nom;
            res += "\nPays : " + this.pays;
            res += "\nFuseaux horaire : " + this.codeFuseauHoraire;
            /**res += "\nDate et heure France : " + this.dateHeureFrance.ToString();
            res += "\nDate et heure GMT : " + this.dateHeureGMT.ToString();
            res += "\nDate et heure locales du port : " + this.dateHeureLocale.ToString();**/

            return res;
        }
    }
}
