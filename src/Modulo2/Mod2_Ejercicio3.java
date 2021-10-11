package Modulo2;

public class Mod2_Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		short cantidadDePaises = 193;
		
		byte TipoDeDivisión = 3;
		short CantidadDeGoles = 3	;
		long LaCapacidadDeLaCancha = 70000 ; 
		double PromedioDeGoles = 2.566;
	
		//Completar con el tipo de dato que corresponda, se debe tener en cuenta que la suma de 2 bytes
		//va a sobrepasar el byte.
		
		byte b=10;
		short s=20;
		int i = 30;
		long l= 40;
		
		int sumabb=b+b;
		int sumabs=b+s;
		long sumabi=b+i;
		long sumaii=i+i;
		long sumasl=s+l;
		
		//Cual de las siguientes líneas dan errores de compilación y para esos casos cubrirlos con el casteo
		//correspondiente, asignándole un valor a las variables por ejemplo short s=25; int I = 1200,
		//finalmente se deberán imprimir en pantalla.
		
		int b1= (short)s;
		l=(long)i;
		b1=(int)i;
		s=(short)i;
	}

}
