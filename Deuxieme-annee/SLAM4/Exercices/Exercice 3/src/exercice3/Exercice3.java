package exercice3;

public class Exercice3
{
    public static void main(String[] args)
    {
        // Déclaration des variables
        int[] tab = {5, 0, 1, 12, -2, -9, 0, 0, 16, -12, 14, 16, 2, -5, -13, 0, 8, 17, 0, -15};
        int i, nombreElementsNegatifs = 0, nombreElementsPositifs = 0, nombreElementsNuls = 0;

        for (i = 0; i <= 19; i++)
        {
            if (tab[i] == 0)
            {
                nombreElementsNuls += 1;
            } else
            {
                if (tab[i] < 0)
                {
                    nombreElementsNegatifs += 1;
                }
                else
                {
                    nombreElementsPositifs += 1;
                }
            }
        }

        System.out.println("Eléments négatifs : " + nombreElementsNegatifs);
        System.out.println("Eléments positifs : " + nombreElementsPositifs);
        System.out.println("Eléments nuls : " + nombreElementsNuls);
    }

}
