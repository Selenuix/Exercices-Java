package exercice10;

import java.util.ArrayList;

public class Stage
{
  // Déclaration des attributs
  private int numero;
  private String theme;
  private int handicapMaxi;
  private String date;
  private  String heure;
  private float tarif;
  private int nbMax;
  private ArrayList<Membre> lesParticipants;

  public Stage(int numero, String theme, int handicapMaxi, String date, String heure, float tarif,
      int nbMax) {
    this.numero = numero;
    this.theme = theme;
    this.handicapMaxi = handicapMaxi;
    this.date = date;
    this.heure = heure;
    this.tarif = tarif;
    this.nbMax = nbMax;
    this.lesParticipants = new ArrayList<>();
  }

  public boolean inscrire(Membre m)
  {
    boolean result = true;

    if (lesParticipants.size() < nbMax)
    {
      if (m.getHandicap() <= handicapMaxi)
      {
        m.ajouterUnStage();
        this.lesParticipants.add(m);
        result = true;
      }
    } else
    {
      result = false;
    }

    return result;
  }

  @Override
  public String toString() {
    String res;

    res = "Numéro : " + this.numero;
    res += "\nThème : " + this.theme;
    res += "\nHandicap maxi : " + this.handicapMaxi;
    res += "\nDate : " + this.date;
    res += "\nHeure : " + this.heure;
    res += "\nTarif : " + this.tarif + " €";
    res += "\nNombre de places : " + this.nbMax;

    for (Membre participant : lesParticipants)
    {
      res += "\n" + participant.getNom();
    }

    res += "\nChiffre d'affaire : " + lesParticipants.size() * this.tarif + " €";

    if (lesParticipants.size() < nbMax)
    {
      res += "\nNombre de places restantes : " + (this.nbMax - lesParticipants.size());
    } else
    {
      res += "\nLe stage est rempli";
    }

    return res;
  }
}
