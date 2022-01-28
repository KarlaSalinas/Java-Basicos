import java.util.Scanner;

public class EstructuraDeControlIf {
	
	public static void main(String[] args) {
		//Estructuras de control de flujo
		/*Nos sirve para la toma de decisiones
		 * 
		 * Estructuras de control de flujo mps sirven para
		 * cambiar el flujo de nuestro programa
		 * evaluando una condición y apartir de ella 
		 * se realuza una acción u otra
		 */
		
		/*
		if(condicion) {
			código
		}else {
			código
		}
		*/
		
		System.out.println("mensaje");
		Scanner sc = new Scanner(System.in);
		int edad = sc.nextInt();
		
		if(edad >= 18) {
			System.out.println("Eres mayor de edad");
		}else {
			System.out.println("Eres menor de edad");
		}
	}

}