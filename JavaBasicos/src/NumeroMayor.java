/*
	* Pedir 3 n�meros al usuario y mostrar un mensaje con el
	* n�mero mayor
	  */
import java.util.Scanner;

public class NumeroMayor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer n�mero");
		int num1 = sc.nextInt();
		System.out.println("Introduce el segundo numero n�mero");
		int num2 = sc.nextInt();
		
		System.out.println("Introduce el tercer n�mero");
		int num3 = sc.nextInt();
		
		
		if(num1 < num2) {
			if(num2 > num3) {
				System.out.println("El mayor de los numeros es: " + num2);
			}else {
				System.out.println("El mayor de los numeros es: " + num3);
			}
		}else if(num1 > num3) {
			System.out.println("El mayor de los numeros es: " + num1);
		}else if(num1 < num3) {
			System.out.println("El mayor de los numeros es: " + num3);
		}else if(num1 == num2 && num2 == num3) {
			System.out.println("Los tres n�meros son iguales");
		}else if(num1 > num2) {
			if(num1 > num3) {
				System.out.println("El mayor de los numeros es: " + num1);
			}else {
				System.out.println("El mayor de los numeros es: " + num3);
			}
		}
		/*if((num1 < num2) && (num2 > num3)) {
			System.out.println("El mayor de los numeros es: " + num2);
		}else if((num1 < num2) && (num2 < num3)){
			System.out.println("El mayor de los numeros es: " + num3);
		} if(num1 > num3) {
			System.out.println("El mayor de los numeros es: " + num1);
		}else if(num1 < num3) {
			System.out.println("El mayor de los numeros es: " + num3);
		}else if(num1 == num2 && num2 == num3) {
			System.out.println("Los tres n�meros son iguales");
		}*/
	}
	
}
