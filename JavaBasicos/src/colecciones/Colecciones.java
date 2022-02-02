package colecciones;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Colecciones {
	public static void main(String[] args) {
		//Las colecciones nos sirven para almacenar un conjunto
		//de objetos
		//La diferencia de las colecciones y los objetos
		//es que las colecciones son din�micas, pueden 
		// cambiar el n�mero de objetos agregados
		
		
		//Set tiene 3 implementaciones
		//no puede contener elementos repertidos
		
		//HashSet
		//Los elementos no mantienen un orden
		
		
		//forechar, puede recorrer una colecci�n y en casa
		//recorriedo recupera el valor y lo podemos almacenar
		//en una variable
		
		//Sintaxis
		//for(tipoDeDatoElemento variable : elementoARecorrer)
		
		/*Set<String> frutas = new HashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("pi�a");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for(String fruta : frutas) {
			System.out.println(fruta);
		}
		*/
		
		//TreeSet
		//Esta implementaci�n ordena los elementos
		//en funci�n de sus valores (alfabeticamente)
		//Por lo anterior es la implementaci�n m�s lenta
		
		/*
		Set<String> frutas = new TreeSet<String>();
		frutas.add("Mango");
		frutas.add("granada");
		frutas.add("pi�a");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for(String fruta : frutas) {
			System.out.println(fruta);
		}
		*/
		
		
		//LinkedHashSet
		//Ordena los elementos en orden de insersi�n
		//Es m�s costoso que HashSet
		//Respeta el orden de insersi�n
		
		/*
		Set<String> frutas = new LinkedHashSet<String>();
		frutas.add("limon");
		frutas.add("granada");
		frutas.add("pi�a");
		frutas.add("Sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for(String fruta : frutas) {
			System.out.println(fruta);
		}
		*/
		
		
	}
}
