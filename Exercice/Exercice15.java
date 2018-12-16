package Exercice;

import java.util.Scanner;

public class Exercice15 {
/* Demandez la saisie d'un mot à l'utilisateur
	Afficher les trois derniers caractères de ce mot
	Afficher ce mot sans les deux premier caractère et sans les trois dernier caractères
	(NB : Gérez le cas où le mot n'est assez long )*/
	
	public static void main(String[] args) {
		
	Scanner test = new Scanner(System.in);
	System.out.println("veuillez choisir un mot");
		String str = test.nextLine();
	
		String str1 = str.substring(str.length()-3);
		System.out.println(str1);

		String str2 = str.substring(2,str.length()-3);
		System.out.println(str2);
		
		int str3 = str.length();
		int nbl = 3;
		if (str3 < 3); {
		System.out.println("error");
		

		}
		
	}
		
	}
	
	

