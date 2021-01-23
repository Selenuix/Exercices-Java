package exercice5;

public class Exercice5
{
    public static void main(String[] args)
    {
        // Déclaration des variables
         int[] tab = {5,0,1,12,2,9,0,0,16,12,14,16,2,5,13,0,8,17,0,15};
         float total = 0, moyenne, ecartType, ecartsMoyenne, totalEcarts = 0;

        // Parcours du tableau
        for (int i = 0; i < 20; i++)
        {
            // Ajout des notes à la moyenne
            total = total + tab[i];
        }

        // Calcul de la moyenne
        moyenne = total / 20;

        // Parcours du tableau
        for (int i = 0; i < 20; i++)
        {
            ecartsMoyenne = tab[i] - moyenne;

            if (ecartsMoyenne < 0)
            {
                ecartsMoyenne = -ecartsMoyenne;
            }

            totalEcarts = totalEcarts + ecartsMoyenne;
        }

        ecartType = totalEcarts / 20;

        // Affichage des résultats
        System.out.println("Moyenne : " + moyenne);
        System.out.println("Ecart type : " + ecartType);
    }
}
