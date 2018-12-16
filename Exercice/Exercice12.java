package Exercice;

public class Exercice12 {
	
/* Déclarez une variable de type tableau de 5 entiers.
	Remplissez ce tableau avec des valeurs aléatoires comprises entre 0 et 10.
	Indiquez si la valeur 4 est dans le tableau, si oui indiquez sa position.*/
	
public static void main(String[] args) {
// création de tableau avec nombre de case définie 
int tableau[] = new int [5];

// math.random = définir une valeur aléatoire entre 0 et 1
for( int i = 0; i <  tableau.length; i ++) {
tableau[i] = (int) (Math.random() *10); // penser a rajouter [i] devant la variable pour qu'il parcourt le tableau 
// conversion avec (int)/(float) etc 
System.out.println(tableau[i]);

}
}
}
