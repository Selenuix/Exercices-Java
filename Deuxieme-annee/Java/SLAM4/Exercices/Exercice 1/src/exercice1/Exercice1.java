package exercice1;

import sio.Saisir;

public class Exercice1
{
    public static void main(String[] args)
    {
        // Déclaration des constantes
        final float TARIF_HORAIRE = 12.50f;
        final int HEURES_SUPPLEMENTAIRES = 140;

        // Déclaration des variables
        int nombreHeures;
        int anciennete;
        float salaire;

        // Saisie du nombre d'heures
        System.out.print("Saisir le nombre d'heures : ");
        nombreHeures = Saisir.i();

        // Saisie de l'ancienneté
        System.out.print("Saisir votre ancienneté : ");
        anciennete = Saisir.i();

        // Tests nombre d'heures minimum
        if (nombreHeures <= HEURES_SUPPLEMENTAIRES)
        {
            salaire = TARIF_HORAIRE * nombreHeures;
        } else
        {
            // Test ancienneté
            if (anciennete < 5)
            {
                salaire = HEURES_SUPPLEMENTAIRES * TARIF_HORAIRE + (nombreHeures - HEURES_SUPPLEMENTAIRES) * (TARIF_HORAIRE * 1.25f);
            } else
            {
                salaire = HEURES_SUPPLEMENTAIRES * TARIF_HORAIRE + (nombreHeures - HEURES_SUPPLEMENTAIRES) * (TARIF_HORAIRE * 1.5f);
            }
        }

        // Affichage du salaire
        System.out.println("Le salaire est de : " + salaire + "€");

    }
}
