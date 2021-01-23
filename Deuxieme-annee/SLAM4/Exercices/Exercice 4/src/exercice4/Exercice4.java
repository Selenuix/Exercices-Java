package exercice4;

public class Exercice4
{
    public static void main (String[] args)
    {
        // Déclaration des constantes et variables
        int[] tab =  {5,0,1,12,-2,-9,0,0,16,-12,14,16,2,-5,-13,0,8,17,0,-15};
        int i, compteur = 0, nombrePrecedent;

        // Parcours des notes
        for (i = 1; i < 20; i++)
        {
            nombrePrecedent = tab[i - 1];

            if (tab[i] >= 0 && nombrePrecedent < 0)
            {
                compteur++;
            }

            if (tab[i] < 0 && nombrePrecedent >= 0)
            {
                compteur++;
            }
        }

        System.out.println(compteur);
    }
}
