package ciclos;
import java.util.Scanner;
/*
 * Utilizando un bucle while

1.- Crea una nueva clase llamada Tabla
2.- Copia el siguiente codigo y verifica que funcione
3.- Debe imprimir la tabla de multiplicar del n�mero en cuesti�n (solo los primeros 10 n�meros)
*/
	
	

	public class Tabla
	{
	    public static void main(String[] args)
	    {
	        Scanner console = new Scanner(System.in);
	        int num;
	        
	        System.out.print("Ingresa cualquier n�mero positivo: ");
	        num = console.nextInt();
	                
	        
	        
	        int multi = 1;
	        
	       if(num < 1) {
	    	   System.out.print("No es un n�mero positivo. Por favor, intentalo de nuevo");
	       }else {
	    	   System.out.println("Tabla de multiplicar de  " + num);
	    	   while(multi <= 10) {
		    	   System.out.println(num * multi);
		    	   multi++;
		       }
	       }
	    }
	}	


