/*
	* Pedir 3 números al usuario y mostrar un mensaje con el
	* número mayor
	  */
import java.util.Scanner;

public class NumeroMayor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer número");
		int num1 = sc.nextInt();
		System.out.println("Introduce el segundo numero número");
		int num2 = sc.nextInt();
		
		System.out.println("Introduce el tercer número");
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
			System.out.println("Los tres números son iguales");
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
			System.out.println("Los tres números son iguales");
		}*/
	}
	
}
