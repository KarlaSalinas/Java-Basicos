
public class ConversionDatos {
	public static void main(String[] args){
		byte numeroByte = 10;
		
		short numeroShort = numeroByte;
		
		int numeroInt = numeroShort;
		
		long numeroLong = numeroInt;
		
		
		//Casteo, conversión o parseo
		int otroInt = (int) numeroLong;
		
		short otroShort = (short) otroInt;
		
		short numero1 = 123;
		short numero2 = 7343;
		
		int suma = numero1 + numero2;
		short suma2 = (short)(numero1 + numero2);
		
		byte num2 = 12;
		byte num3 = 33;
		
		byte suma3 = (byte) (num2 + num3);
		short suma4 = (short) (numero1 + num2);
		
	}
}
