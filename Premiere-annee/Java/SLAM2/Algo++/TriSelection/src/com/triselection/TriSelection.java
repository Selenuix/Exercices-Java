package com.triselection;

/**
 *
 * @author CISZEK
 */
public class TriSelection {
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// Déclaration des variables
		int[] tab = {12,9,7,6,5,87,24,31,1,55,78};

		System.out.println("Avant le tri :");
		for(int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " - ");
		}

		tab = trier(tab);

		System.out.println("\nAprès le tri :");
		for(int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " - ");
		}

	}

	public static int[] trier(int[] tab) {
		int i,j, min, iMin, temp;

		for(i = 0; i < (tab.length - 1); i++) {
			iMin = i;
			min = tab[i];

			for(j = i; j < tab.length; j++) {
				if(tab[j] < min) {
					min = tab[j];
					iMin = j;
				}
			}
			// Permutation
			temp = tab[i];
			tab[i] = tab[iMin];
			tab[iMin] = temp;
		}

		return tab;
	}

}
