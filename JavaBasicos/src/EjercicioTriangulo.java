/*
Pedirle 3 �ngulos a un usuario y decirle si es un triangulo v�lido
*/
import java.util.Scanner;

public class EjercicioTriangulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa el valor del primer angulo:");
		int angulo1 = sc.nextInt();
		
		System.out.println("Ingresa el valor del segundo angulo:");
		int angulo2 = sc.nextInt();
		
		System.out.println("Ingresa el valor del tercer angulo:");
		int angulo3 = sc.nextInt();
		
		if((angulo1 + angulo2 + angulo3) == 180) {
			System.out.println("Es un triangulo v�lido");
		}else {
			System.out.println("No es un tri�ngulo valido :(");
		}
	}
}
