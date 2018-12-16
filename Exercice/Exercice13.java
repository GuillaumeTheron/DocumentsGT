package Exercice;

import java.util.Scanner;
/* 1.demander à un utilisateur de saisir une chaine de caractère
2.demander à cet utilisateur de saisir une lettre
3.calculez le nombre de fois où cette lettre est présente dans la chaine saisie en 1.*/

public class Exercice13 {


public static void main(String[] args) {
// je saisie mon mot
Scanner sc = new Scanner(System.in);	
String chaine = "saisir un mot";
System.out.println(chaine);
// je saisie une lettre
Scanner test = new Scanner(System.in);
String Lettre = "saisir une lettre";
System.out.println(Lettre);
// je config le compteur
int compteur = 0; 
// je fais un for pour ciruculer dans mon tableau
for (int i = 0; i < chaine.length(); i++) { 
	if (chaine.charAt(i) == Lettre.charAt(0)) {
		compteur ++;
		// j'affiche le compteur
		System.out.println("ajout d'une lettre dans le compteur");
	}
	}
// j'affiche la lettre + le nb de lettre + le compteur
System.out.println(Lettre + "lettre" + compteur);
}
}