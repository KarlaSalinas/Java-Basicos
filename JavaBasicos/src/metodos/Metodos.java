package metodos;

public class Metodos {
	//M�todos es una funci�n
	
	//atributos de la clase
	int a, b;
	
	
	//M�todo void (Vac�o)
	public void sumar(){
		int resultado = a + b;
		System.out.println("El resultado de sumar " + a + " + " + b + " es: " + resultado);
	}
	
	
	//M�todo con retorno de valores
	public int sumaConRetorno() {
		//int resultado = a + b;
		//return resultado;
		return a + b;
	}
	
	
	//argumentos
	//suma(argumentos)
	
	public double multiplicarConArgumentos(int num1, double num2) {
		return num1 * num2;
	}
	
	
	//M�todo est�tico
	//este m�todo es, void(no regresa datos) y usa argumentos
	public static void imprimirNombre(String nombre) {
		System.out.println("Mi nombre es: " + nombre);
	} 
}
