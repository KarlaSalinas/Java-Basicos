package ciclos;

public class Ciclos {
	public static void main(String[] args) {
		//while
		
		/*int control = 0;
		
		while(control < 10) {
			System.out.println("Control = " + control);
			control++;
		}*/
		
		//do while
		/*int control = 0;
		
		do {
			//Código a ejecutar
			System.out.println("Control = " + control);
			//modificador de la variable de control
			control++;
		}while(control < 3);*/
		
		//for
		for(int i = 0; i < 10 ; i++) {
			if(i % 2 == 0){
				continue; //permite saltarnos una ejecición
				// del ciclo y luego coninúa el ciclo
			}
			System.out.println("Control = " + i);
			//break;
		}
		for(int i = 0; i < 3; i++) {
			System.out.println("Control = " + i);
			continue;
		}
	}	
}
