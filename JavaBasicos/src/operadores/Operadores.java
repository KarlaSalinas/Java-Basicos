package operadores;

public class Operadores {
	public static void main(String[] args) {
		//Operadores Aritméticos
		//+, -, /, *,  %
		
		int a = 10;
		int b = 20;
		double c = 10.5; 
		
		int suma= a + b;
		System.out.println(suma);
		
		String str1 = "El resultado de la suma es: ";
		System.out.println(str1 + suma);
		
		//Resta
		System.out.println("El resultado de la resta es: " + (b - a));
		
		//división
		int division = a / b;		
		System.out.println("El resultado de la división es: " + division);
		
		//double division2 = (double) c / b;
		double division2 = c / b;
		//por lo menos uno de los datos debe ser de tipo double
		//10.0 / 20 = 0.5
		System.out.println("El resultado de la división es: " + division2);
		
		//multiplicación
		double multiplicacion = c * a;
		System.out.println("El resultado de la multiplicación es: " + multiplicacion);
		
		//modulo
		int modulo = a % b;
		System.out.println("El módulo de la operación es: " + modulo);
		
		
		/*
		 * Operador de asignación
		 * =
		 */
		
		int d = 5, e; //inicializar las variables vacías
		e = 6;
		
		System.out.println(d + "," + e);
		
		//Operadores de declaración compuesta
		// +=, -=, /=, %=
		//Permiten realizar una operación simple
		
		int f = 0, g = 5;
		f += 5;
		// f = f + 5;
		System.out.println(f);
		
		//Operadores relacionales
		/* <, >, >=, <=
		 * == igualdad
		 *  != diferencia
		 *  Resultado un valor de tipo boolean (true, false)
		 */
		int h = 15, i = 25;
		String j = "Hola";
		
		System.out.println(h > i); //false
		System.out.println(i != h);
		//System.out.printlnh != j(); // son de diferente tipo y no se pueden comparar
		
		//Operador unario
		/* ++, --
		 * presignación -- ++k Se le asigna un valor antes de usarse
		 * postasignación -- k++ primero lee el valor y después le suma 1
		 */
		
		int k = 0, l = 0;
		k++;
		System.out.println(k);
		System.out.println(--l);
		
		
		//Precedencia de operadores
		
		int operacion = (4 + 5) * 6 / 3;
		
		System.out.println(operacion);
		
		int x = 0, y= 0;
		int operacion2 = ++x + y--;
		System.out.println(operacion2);
		
		//operador ternario
		
		int edad = 18, valor1 = 0;
		
		int resultado = (edad <= 18) ? (valor1 = 2): (valor1 = 3);
		// también puede ser
		// int valor = (edad <= 18) ? 2:1;
		
		System.out.println(resultado);
		
		
		//operadores lógicos
		// and - &&
		//or - ||
		//not !
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(true || false);
		System.out.println(true && !false);
	}
}
