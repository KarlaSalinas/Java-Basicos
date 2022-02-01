package ciclos;

import java.util.Scanner;

/*
Escribe un programa que pida al usuario ingresar su nombre y que entonces imprima cada una de las letras de su nombre.

Ejemplo: "Juan"
"J"
"u"
"a"
"n"
 */
public class DeletreaNombre {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa tu nombre");
		String nombre = sc.nextLine();
		
		if(nombre.length() < 1) {
			System.out.println("Error. Intenta de nuevo");
		}else {
			for(int i = 0; i < nombre.length(); i++) {
				System.out.println(nombre.charAt(i));
			}
		}
	}
}
