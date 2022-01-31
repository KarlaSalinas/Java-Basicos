import java.util.Scanner;

/*
	 Pedir al usuario 2 números por consola y preguntarle que desea realizar
	 1) Suma
	 2) Resta
	 3) División
	 4) Multiplicación
	 Y despues imprimir el resultado


*/
public class Calculadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa el primer número");
		int num1 = sc.nextInt();
		
		System.out.println("Ingresa el segundo número");
		int num2 = sc.nextInt();
		
		System.out.println("¿Qué operación deseas realizar? (Ingresa el número de la opción)\n"
				+ "1) Suma\r\n"
				+ "2) Resta\r\n"
				+ "3) División\r\n"
				+ "4) Multiplicación");
		int opc = sc.nextInt();
		
		switch(opc) {
		case 1:
			System.out.println("El resultado de sumar " + num1 + " + " + num2 +  " es: " + (num1+num2));
			break;
		case 2:
			System.out.println("El resultado de restar " + num1 + " - " + num2 +  " es: " + (num1-num2));
			break;
		case 3:
			System.out.println("El resultado de dividir " + num1 + " / " + num2 +  " es: " + (num1 / num2));
			break;
		case 4:
			System.out.println("El resultado de multiplicar " + num1 + " * " + num2 +  " es: " + (num1 * num2));
			break;
		default:
			System.out.println("Esa opción no es valida, intenda de nuevo");
			break;
		}
	}
}
