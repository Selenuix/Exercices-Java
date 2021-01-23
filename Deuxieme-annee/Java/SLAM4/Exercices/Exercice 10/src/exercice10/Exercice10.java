package exercice10;

public class Exercice10
{
  public static void main(String[] args)
  {
    // Déclaration des objets
    Stage stage1;
    Membre membre1, membre2, membre3, membre4, membre5, membre6, membre7;

    // Instanciation des objets
    stage1 = new Stage(1, "Entame au driver", 4, "10-09-2020", "11h55", 50.0f, 5);
    membre1 = new Membre(1, 4, "GASSER");
    membre2 = new Membre(2, 3, "BOEGLIN");
    membre3 = new Membre(3, 3, "CISZEK");
    membre4 = new Membre(4, 1, "GASHI");
    membre5 = new Membre(5, 4, "TEST3");
    membre6 = new Membre(6, 52, "TEST4");
    membre7 = new Membre(7, 1, "TEST5");

    // Ajout des membres au stage
    if (stage1.inscrire(membre1))
    {
      System.out.println("Membre inscrit");
    } else
    {
      System.out.println("Erreur");
    }

    if (stage1.inscrire(membre2))
    {
      System.out.println("Membre inscrit");
    } else
    {
      System.out.println("Erreur");
    }

    if (stage1.inscrire(membre3))
    {
      System.out.println("Membre inscrit");
    } else
    {
      System.out.println("Erreur");
    }

    if (stage1.inscrire(membre4))
    {
      System.out.println("Membre inscrit");
    } else
    {
      System.out.println("Erreur");
    }

    if (stage1.inscrire(membre5))
    {
      System.out.println("Membre inscrit");
    } else
    {
      System.out.println("Erreur");
    }

    if (stage1.inscrire(membre6))
    {
      System.out.println("Membre inscrit");
    } else
    {
      System.out.println("Erreur");
    }

    if (stage1.inscrire(membre7))
    {
      System.out.println("Membre inscrit");
    } else
    {
      System.out.println("Erreur");
    }

    System.out.println(stage1.toString());
  }
}
