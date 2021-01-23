package exercice6;

import sio.Saisir;

public class Exercice6
{
    public static void main(String[] args)
    {
        // Déclaration des variables
        int nombre;

        System.out.print("Quelle est la factorielle à calculer : ");
        nombre = Saisir.i();
        factorielle(nombre);
    }

    public static void factorielle(int nombre)
    {
        // Déclaration des variables
        int factorielle = 1;

        // Contraintes
        if (nombre < 0)
        {
            System.out.println("Le nombre doit être supérieur à 0.");
        }

        if (nombre == 0)
        {
            factorielle = 1;
        }

        for (int i = 1; i <= nombre; i++)
        {
            factorielle = factorielle * i;
        }

        System.out.println("La factorielle est de : " + factorielle);
    }
}
