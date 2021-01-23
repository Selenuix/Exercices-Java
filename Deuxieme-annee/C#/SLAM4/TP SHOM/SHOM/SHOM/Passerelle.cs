using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;
using System.Xml;

namespace SHOM
{
    class Passerelle
    {
        // Déclaration des attributs
        private static string urlCarte = "https://services.data.shom.fr/spm/listHarbors";

        // Récupération de la carte
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
                while(xml.Read())
                {
                    // Si la ligne est une balise
                    if (xml.NodeType.Equals(XmlNodeType.Element))
                    {
                        // Si la balise est <si>
                        if (xml.LocalName.Equals("harbor"))
                        {
                            // Récupération des valeurs des différents attributs
                            string identifiant = xml.GetAttribute("cst");
                            string nom = xml.GetAttribute("name");
                            string pays = xml.GetAttribute("country");
                            string codeFuseauHoraire = xml.GetAttribute("defaultUT");
                            DateTime dateHeureFrance = DateTime.Now;
                            DateTime dateHeureGMT = dateHeureFrance.AddHours(-1);
                            DateTime dateHeureLocale = dateHeureGMT.AddHours(int.Parse(codeFuseauHoraire));

                            c.ajouterPort(identifiant, nom, pays, codeFuseauHoraire);
                            c.ajouterPays(pays);
                        }
                    }
                }

                return c;
            } catch (Exception ex)
            {
                Console.WriteLine("Attention !! " + ex.Message);
                return null;
            }
        }
    }
}
