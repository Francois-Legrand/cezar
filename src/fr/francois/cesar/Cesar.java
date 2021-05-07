package fr.francois.cesar;

import java.util.ArrayList;
import java.util.Scanner;


public class Cesar {
	public static void main(String[] args) {
		String mot;
		ArrayList<String> tableauCoder = new ArrayList<>();
		String[] alphabet = new String[] {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		int cle = 3;
		int result;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choisissez un mot");
		mot = scanner.nextLine();
		String[] convertStringtoArray = new String[mot.length()];
		 for (int i = 0; i < mot.length(); i++) {
			 convertStringtoArray[i] = String.valueOf(mot.charAt(i));
			 for(int j = 0; j < alphabet.length; j++) {
				 if (convertStringtoArray[i].equals(alphabet[j])) {
						if (j - cle < 0) {
							result = j - cle;
							result += 26;
							tableauCoder.add(alphabet[result]);
						}else {
							result = j - cle;
							tableauCoder.add(alphabet[result]);
						}
					}
			 }
			 System.out.println(tableauCoder);
			 scanner.close();
	     }
	}
}
