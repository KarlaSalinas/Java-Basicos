import java.util.Scanner;

public class ScannerYBuffer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero");
		int num1 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Introduce tu nombre");
		String nombre = sc.nextLine();
		
		
		
		
		System.out.println("Tu nombre es " + nombre + ". Tu n�mero es: " + num1);
		/*
		System.out.println("Introduce otro n�mero");
		int num2 = sc.nextInt();
		
		System.out.println("N�mero 1: " + num1 + "\nN�mero 2:  " + num2);
		*/
	}
}

