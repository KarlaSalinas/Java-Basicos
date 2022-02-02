package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

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
		System.out.println("\n" +"**************************");
		System.out.println("**************************");
		
		
		//LinkedList
		//Es una lista doblemente enlazada
		//Es más rápido para insertar y remover elementos
		
		List<String> digimones = new LinkedList<String>();
		
		digimones.add("Agumon");
		digimones.add("Patamon");
		digimones.add("Gatomon");
		digimones.add("Angemon");
		digimones.add("Greymon");
		
		for(String digimon : digimones) {
			System.out.println(digimon);
		}
		
		System.out.println("\n*******************");
		//Map
		/*
		Asocia claves a valores.
		No puede contener claves duplicadas
		Sólo puede tenner un valor asociado
		*/
		
		//HashMap
		/*
		Tiene mejor rendimiento pero no garantiza un orden
		a la hora de hacer iteraciones
		*/
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(1123, "Carlos Eduardo");
		usuarios.put(2213, "Raúl"); //no acepta claves duplicadas
		usuarios.put(2213, "Luis Angel"); 
		usuarios.put(3532, "Ro");
		
		System.out.println(usuarios.get(2213));
		
		//keySet
		//Permite recuperar el nombre de la clave 
		
		
		System.out.println(usuarios.keySet());
		
		//values
		//nos permite recuperar el valor directamente
		System.out.println(usuarios.values());
		
		System.out.println("\n*******************");
		//TreeMap
		Map<String, String> tamales = new TreeMap<String, String>();
		
		tamales.put("Oaxaqueños", "Mole rojo");
		tamales.put("Torta", "Mole verde");
		tamales.put("Dulces", "Gansito");
		tamales.put("Salado", "Cochinita");
		
		System.out.println(tamales.keySet());
		System.out.println(tamales.values());
		
		System.out.println(tamales);
		
		System.out.println("\n\n");
		
		tamales.entrySet().forEach(clave -> {
			//System.out.println(clave.getKey().toString() + clave.getValue().toString());
			System.out.println(clave);
		});
		
		System.out.println("\n*******************");
		
		//LinkedHashMap
		//Almacena las claves en función del orden de inserción
		Map<Integer, String> Carros =  new LinkedHashMap<Integer, String>();
		Carros.put(1, "Volvo");
		Carros.put(483,"Pointer");
		Carros.put(53, "Mustang");
		
		System.out.println(Carros.keySet());
		System.out.println(Carros.values());
		
	}                    
}
