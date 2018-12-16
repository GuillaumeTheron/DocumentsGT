package Exercice;

import java.util.Scanner;

public class Exercice14 {
	/*1.demander à un utilisateur de saisir une chaine de caractère
	2.retournez cette chaine en majuscule
	3.retournez cette chaine avec la première lettre en majuscule*/

public static void main(String[] args) {
// je saisie une chaine de caratère
	Scanner test = new Scanner(System.in);
System.out.println("veuillez choisir une chaine de caratere");
// je créer une variable string pour y ajouter un toUpperCase qui vas mettre letous en maj
	String str = test.nextLine();
	System.out.println("vous avez saisie : " + str);
	System.out.println(str.toUpperCase());
	
// je saisie une chaine de caratère
	Scanner test1 = new Scanner(System.in);
	System.out.println("veuillez saisir une chaine de caratère ");
	String chaine = test1.nextLine();
	// replaceFirst remplace la premier lettre, puis chaine.chartAt(0) et 
	String chaineMaj=chaine.replaceFirst(".",(chaine.charAt(0)+"").toUpperCase());
	System.out.println(chaineMaj);
	
}
}
