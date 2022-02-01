package colecciones;

import java.util.HashSet;
import java.util.Set;

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
		Set<String> frutas = new HashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("piña");
		frutas.add("sandia");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for(String fruta : frutas) {
			System.out.println(fruta);
		}
		
		//TreeSet
		//LinkedSet
	}
}
