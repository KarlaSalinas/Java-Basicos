import java.util.Scanner;

//si la cuenta es de menos de 1000
// sila cuenta es de 1000 - 4999 10%
// si la cuenta es de 5000 a 9999 20%
// si la copra es de 10000 o más 30%


public class EjercicioDescuento {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa el total de tu compra");
		int totalCompra = sc.nextInt();
		
		if(totalCompra < 1000 && totalCompra > 0) {
			System.out.println("El total a pagar es: " + totalCompra + ", no hay descuento :(");
		}else if(totalCompra >= 1000) {
			System.out.println("El total a pagar es: " + (totalCompra*.9) + ", obtuviste un descuento del 10%");
		}else if(totalCompra >= 5000) {
			System.out.println("El total a pagar es:  " + (totalCompra*.8) + ", obtuviste un descuento del 20%");
		}else if(totalCompra >= 10000) {
			System.out.println("El total a pagar es: " + (totalCompra*.7) + ", obtuviste un descuento del 30%");
		}else {
			System.out.println("Se presento un error. Ingresa nuevamente el total de tu compra.");
		}
	}
}
