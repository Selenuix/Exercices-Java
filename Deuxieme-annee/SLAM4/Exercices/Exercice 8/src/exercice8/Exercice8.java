package exercice8;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Exercice8
{
    public static void main(String[] args) throws IOException {
        // Déclaration des variables
        int[] place = {10,6,4,3,2,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int ligneClassement = 0;
        String ligne;
        Resultats[] classement = new Resultats[10];

        // Ouverture du fichier en lecture seule
        BufferedReader fic = new BufferedReader(new FileReader("c:/resultats.dat"));

        // Lecture du fichier jusqu'à la fin
        String pilote = "", piloteEnCours;

        ligne = fic.readLine();
        while (ligne != null)
        {
            String[] info = ligne.split(";");

            piloteEnCours = info[1];

            int totalPoints = 0;

            while (piloteEnCours.equals(info[1]) && ligne != null)
            {
                int indice = Integer.parseInt(info[2]);
                totalPoints += place[indice - 1];
                ligne = fic.readLine();

                if (ligne != null)
                {
                    info = ligne.split(";");
                }
            }

            classement[ligneClassement] = new Resultats();
            classement[ligneClassement].pilote = piloteEnCours;
            classement[ligneClassement].nbPoints = totalPoints;
            ligneClassement++;
        }

        // Fermeture du fichier
        fic.close();

        for (int i = 0; i < ligneClassement; i++)
        {
            System.out.println(classement[i].pilote + " : " + classement[i].nbPoints);
        }
    }
}
