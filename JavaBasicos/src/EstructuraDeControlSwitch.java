import java.util.Scanner;

public class EstructuraDeControlSwitch {
	public static void main (String[] args) {
		//Estructuras de  control nos sirven para 
		//controlar el flujo de comportamiento de un programa.
		//Para la toma de decisiones
		
		/*
		 switch(condicion_a_evaluar){
		 	case "valor":
		 		//código a ejecutar
		 		//break
		 	...
		 	case "n":
		 		//código a ejecutar
		 		//break
		 	default:
		 		//código a ejecutar
		 } 
		*/
		
		//Solicitar al usuario un día de la semana
		//y mostrar un mensaje
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un día de la semana y recibirás un bonito mensaje ;)");
		String dia = sc.nextLine();
		
		switch(dia.toLowerCase()) {
		case "lunes":
			System.out.println("Ya mero es viernes, toma un café");
			break;
		case "martes":
			System.out.println("Lunes chiquito. Esto esta cansado, pero ya casi");
			break;
		case "miercoles":
			System.out.println("Miércoles, pero a qué costo");
			break;
		case "jueves":
			System.out.println("Juebebes de sed peligrosa");
			break;
		case "viernes":
			System.out.println("Vienesuquis de fiesta");
			break;
		case "sabado":
			System.out.println("Adoro estos sabados de flojera");
			break;
		case "domingo":
			System.out.println("Duerme hasta tarde");
			break;
		default:
			System.out.println("Error. Ingresa nuevamente un día de la semana");
			break;
		}
		
	}
}
