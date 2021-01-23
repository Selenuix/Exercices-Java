using System;
using System.Net;
using System.IO;
using System.Xml;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TPVelos
{
    class Passerelle
    {
        //Attributs statiques privés
        private static string urlCarte = "http://data.montpellier3m.fr/sites/default/files/ressources/TAM_MMM_VELOMAG.xml";
        
		public static Carte getCarte()
        {
            try
            {
                // Création d'une requête HTTP
                HttpWebRequest requete = (HttpWebRequest)WebRequest.Create(urlCarte);
                requete.Method = WebRequestMethods.Http.Get;
                WebResponse rep = requete.GetResponse();

                // Déclaration d'un flux de données de type fichier
                StreamReader sr = new StreamReader(rep.GetResponseStream());

                // Précision du document XML
                XmlTextReader xml = new XmlTextReader(sr);

                // Instanciation d'une carte
                Carte c = new Carte();

                // Tant qu'il y a des lignes à lire
                while (xml.Read())
                {
                    // Si la ligne est une balise
                    if (xml.NodeType.Equals(XmlNodeType.Element))
                    {
                        // Si la balise est <si>
                        if (xml.LocalName.Equals("si"))
                        {
                            // Récupération des valeurs des différents attributs
                            string id = xml.GetAttribute("id");
                            string nom = xml.GetAttribute("na");
                            string latitude = xml.GetAttribute("la");
                            string longitude = xml.GetAttribute("lg");
                            string nbPlacesOccupees = xml.GetAttribute("av");
                            string nbPlacesLibres = xml.GetAttribute("fr");
                            string nbTotalPlaces = xml.GetAttribute("to");

                            c.ajouterStation(int.Parse(id), nom, latitude, longitude, int.Parse(nbPlacesOccupees), int.Parse(nbPlacesLibres), int.Parse(nbTotalPlaces));
                        }
                    }
                }

                return c;
            }
            catch (Exception ex)
            {
                Console.Write("Attention !! " + ex.Message);
                return null;
            }
        }
    }
}
