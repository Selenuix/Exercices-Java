package exercice7;

import sio.Saisir;

public class Exercice7
{
    public static void main(String[] args)
    {
        // Déclaration des variables
        int nombre, factorielle;

        // Saisie du nombre
        System.out.print("Quelle est la factorielle à calculer : ");
        nombre = Saisir.i();

        // Calcul de la factorielle
        factorielle = factorielle(nombre);

        // Affichage du résultat
        System.out.println("Résultat : " + factorielle);
    }

    public static int factorielle(int nombre)
    {
        // Déclaration des variables
        int factorielle = 1;

        // Contraintes
        if (nombre < 0)
        {
            factorielle = -1;
        }

        if (nombre == 0)
        {
            return 1;
        }

        for (int i = 1; i <= nombre; i++)
        {
            factorielle = factorielle * i;
        }
        return factorielle;
    }
}
