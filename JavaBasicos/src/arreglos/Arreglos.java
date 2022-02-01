package arreglos;

public class Arreglos {
	public static void main(String[] args) {
		//Solo almacenan un tipo de dato
		//especificar el tamaño o la cantidad de elementos que va a contener
		
		//Maneras de declarar un array
		
		//1 manera
		int numeros[]; //creamos la variable
		numeros = new int[4]; //Se crea el arreglo
		
		//2 manera
		String[] nombres = new String[4];
		
		
		//3 manera
		String []nombreFrutas = new String[] {"Manzana", "Platano", "Uva", "Pera"};
		
		numeros[0] = 10; //inserta un número en la posición 0
		numeros[1] = 8;
		numeros[2] = 100; 
		numeros[3] = 200;
		
		nombres[0] = "Juan";
		nombres[1] = "Pedro";
		nombres[2] = "Antonio";
		nombres[3] = "Felipe";
		
		//System.out.println(numeros[0]);
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Elemento de números: " +numeros[i]);
			System.out.println("Elemento de nombres: " +nombres[i]);
			System.out.println("Elemento de frutas: " +nombreFrutas[i]);
			System.out.println("------------------------");
		}
	}
	
}
