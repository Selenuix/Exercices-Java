package exercice2;

import sio.Saisir;

public class Exercice2
{
    public static void main(String[] args)
    {
        // Déclaration des variables
        float noteMinimale = -1, noteMaximale = -1, moyenne = 0, note;
        int i;

        // Demande des 10 notes
        for (i = 1; i <= 10; i++)
        {
            // Saisie de la note
            System.out.print("Saisir note " + i + " : ");
            note = Saisir.i();

            if (i == 1)
            {
                noteMaximale = note;
                noteMinimale = note;
            }

            // Vérification note minimale
            if (note < noteMinimale)
            {
                noteMinimale = note;
            }

            // Vérification note maximale
            if (note > noteMaximale)
            {
                noteMaximale = note;
            }

            // Ajout des notes
            moyenne = (moyenne + note);
        }

        // Calcul moyenne
        moyenne = moyenne / 10;

        // Affichage des résultats
        System.out.println("Note minimale : " + noteMinimale);
        System.out.println("Note maximale : " + noteMaximale);
        System.out.println("Moyenne : " + moyenne);
    }
}
