package metodos;

public class PruebaMetodos {
	public static void main(String[] args) {
		Metodos.imprimirNombre("Karla");
		
		//Crear un nuevo objeto que va a contener los métodos
		//y atributos
		
		Metodos metodoPrueba = new Metodos(); //Creamos un objeto
		
		metodoPrueba.a = 10;
		metodoPrueba.b = 26;
		
		metodoPrueba.sumar();//Invocamos el método
		
		
		//este tipo de métodos se pueden almacenar dentro de una variable
		//System.out.println("El resultado de la suma es: " + metodoPrueba.sumaConRetorno());
		int resultadoSuma = metodoPrueba.sumaConRetorno();
		System.out.println(resultadoSuma);
		
		
		System.out.println("El resultado de la multiplicación es: " + metodoPrueba.multiplicarConArgumentos(10, 9.2));
		
		
	}
}
