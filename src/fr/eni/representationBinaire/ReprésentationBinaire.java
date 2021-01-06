package fr.eni.representationBinaire;

import java.util.Scanner;

public class ReprésentationBinaire {
	static int saisie;

	public static void main(String[] args) {
		System.out.println("Bienvenu dans l'exercice de conversion");
		System.out.println("Saisir un nombre entre 0 et 256 à convertir:");
		saisie = scanner();
		calculBinaire();
	}

	public static void calculBinaire() {
		int nbrAConvertir = saisie;
		String nbrBinaire = "";
		if (saisie >= 0 && saisie <= 256) {
			while (nbrAConvertir >= 2) {
				int reste = nbrAConvertir % 2;
				nbrBinaire += reste;
				nbrAConvertir /= 2;
			}
			nbrBinaire = nbrAConvertir + nbrBinaire;
			System.out.println(saisie + " = " + nbrBinaire);
		} else {
			System.out.println("Nombre incorrect");
		}
	}

	public static int scanner() {
		Scanner scanner = new Scanner(System.in);
		int saisie = scanner.nextInt();
		return saisie;
	}
}
