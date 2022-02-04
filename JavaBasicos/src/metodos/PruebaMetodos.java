package metodos;

public class PruebaMetodos {
	public static void main(String[] args) {
		Metodos.imprimirNombre("Karla");
		
		//Crear un nuevo objeto que va a contener los m�todos
		//y atributos
		
		Metodos metodoPrueba = new Metodos(); //Creamos un objeto
		
		metodoPrueba.a = 10;
		metodoPrueba.b = 26;
		
		metodoPrueba.sumar();//Invocamos el m�todo
		
		
		//este tipo de m�todos se pueden almacenar dentro de una variable
		//System.out.println("El resultado de la suma es: " + metodoPrueba.sumaConRetorno());
		int resultadoSuma = metodoPrueba.sumaConRetorno();
		System.out.println(resultadoSuma);
		
		
		System.out.println("El resultado de la multiplicaci�n es: " + metodoPrueba.multiplicarConArgumentos(10, 9.2));
		
		
	}
}
