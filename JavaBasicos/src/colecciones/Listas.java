package colecciones;

import java.util.ArrayList;
import java.util.List;

public class Listas {
	public static void main(String[] args) {
		//List
		//Se permiten elementos duplicados
		//Se puede aaceder a elementos especificos
		//Se pueden buscar elementos
		
		//ArrayList
		
		List<String> pokemones = new ArrayList<String>();
		pokemones.add("Pancham");
		pokemones.add("Eevee");
		pokemones.add("Dragonite");
		pokemones.add("Charizard");
		pokemones.add("Gengar");
		pokemones.add("Vaporeon");
		
		
		/*
		 	add, si agregamos un indice y un  elemento, posiciona
		 	el elemento en el índice y realiza un desplazamiento
		 	es decir no borra el elemento en la posición sino
		 	que lo desplaza
		 */
		pokemones.add(2, "Snorlax");
		
		
		//remove, remueve el elemento de la posición especificada
		pokemones.remove(4);
		
		//set reemplaza el elemento en la posición especificada
		pokemones.set(5, "Flareon");
		
		for(String pokemon : pokemones) {
			System.out.println(pokemon);
		}
		
		System.out.println("***********************");
		System.out.println("======= METODOS =======");
		System.out.println(pokemones.get(0));
		System.out.println(pokemones.get(5));
		
		/*
		indexOd, devuelve la posición del elemento y si
		el elemento no se encuentra devuelve -1
		*/ 
		
		System.out.println(pokemones.indexOf("Gengar"));
		System.out.println(pokemones.indexOf("Togepi"));
		
		
		
		
	}                    
}
