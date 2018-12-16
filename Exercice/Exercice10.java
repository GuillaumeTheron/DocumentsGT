package Exercice;

public class Exercice10 {
//Déclarez et initialisez une variable tab1 de type tableau contenant les 4 éléments suivants : 4, 67, 25, 87.
	/*Déclarez et initialisez une variable tab2 de type tableau contenant les 4 éléments suivants : 4.5, 67, 25.50, 87.00
	Déclarez et initialisez une variable tab3 de type tableau contenant les 4 éléments suivant : 'r', '2', '?' , '+'.
	Déclarez et initialisez une variable tab4 de type tableau contenant les 4 éléments suivant : "Robert",
	"Noemie", "David" , "Bertrand".
	
	Affichez le premier élément de tab1
	Remplacez la valeur de tab1 qui vaut 25 par la valeur 42.
	Afficher via une boucle for , toutes les valeurs de tab3.
	Affichez la taille de tab1*/


public static void main(String[] args) {
	
int tab1 [] = {4, 67,25,87};

System.out.println(tab1[0]);
tab1 [2] = 42;

double tab2 [] = {4.5, 67, 25.50, 87.00};
// for ( int i = nb de départ ; i < longueur tableau avec Variable.length; i ++ = i+1
char tab3 [] = {'r', '2', '?', '+'};
for( int i = 0; i <  tab3.length; i ++) {
	// on affiche avec syso la variable avec [i]
	System.out.println(tab3[i]);
}
System.out.println(tab1.length);

String tab4 [] = {"Robert", "Noemie", "David", "Bertrand"};

}

}
