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
		//es que las colecciones son dinámicas, pueden 
		// cambiar el número de objetos agregados
		
		
		//Set tiene 3 implementaciones
		//no puede contener elementos repertidos
		
		//HashSet
		//Los elementos no mantienen un orden
		
		
		//forechar, puede recorrer una colección y en casa
		//recorriedo recupera el valor y lo podemos almacenar
		//en una variable
		
		//Sintaxis
		//for(tipoDeDatoElemento variable : elementoARecorrer)
		
		/*Set<String> frutas = new HashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for(String fruta : frutas) {
			System.out.println(fruta);
		}
		*/
		
		//TreeSet
		//Esta implementación ordena los elementos
		//en función de sus valores (alfabeticamente)
		//Por lo anterior es la implementación más lenta
		
		/*
		Set<String> frutas = new TreeSet<String>();
		frutas.add("Mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for(String fruta : frutas) {
			System.out.println(fruta);
		}
		*/
		
		
		//LinkedHashSet
		//Ordena los elementos en orden de insersión
		//Es más costoso que HashSet
		//Respeta el orden de insersión
		
		/*
		Set<String> frutas = new LinkedHashSet<String>();
		frutas.add("limon");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("Sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for(String fruta : frutas) {
			System.out.println(fruta);
		}
		*/
		
		
	}
}
