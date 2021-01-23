package testhashmap;

import java.util.HashMap;

public class TestHashMap {
    public static void main(String[] args) {
		//Déclaration d'un dictionnaire String/Float
		HashMap<String,Float> lesNotes;
		lesNotes = new HashMap();

		//Ajout des notes des élèves
        lesNotes.put("John", new Float(15.5));
        lesNotes.put("Jaco", new Float(12.0));
        lesNotes.put("Chris", new Float(17.5));
        lesNotes.put("Stella", new Float(11.0));      
        lesNotes.put("Julie", new Float(8.5));  
		
		//Affichage des élèves, de leur notes et calcul de la moyenne
		float somme = 0, moyenne;
		for(String eleve : lesNotes.keySet()){
            res = res + "\n" + eleve + "\t\t" + lesNotes.get(eleve);
			somme = somme + lesNotes.get(eleve);
        }
		
		moyenne = somme / lesNotes.size();
		
		//Affichage de la moyenne
		System.out.println("\nMoyenne ->\t" + moyenne);    
	}
}