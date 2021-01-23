package exercice10;

public class Membre
{
  // Déclaration des attributs
  private int numero;
  private int nbStage;
  private int handicap;
  private String nom;

  public Membre(int num, int h, String leNom) {
    this.numero = num;
    this.nbStage = 0;
    this.handicap = h;
    this.nom = leNom;
  }

  public void ajouterUnStage()
  {
    this.nbStage++;
  }

  public int getHandicap()
  {
    return this.handicap;
  }

  public String getNom() {
    return this.nom;
  }

  @Override
  public String toString() {
    return "Membre{" +
        "numero=" + numero +
        ", nbStage=" + nbStage +
        ", handicap=" + handicap +
        ", nom='" + nom + '\'' +
        '}';
  }
}
