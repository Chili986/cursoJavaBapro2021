package operacionesLogicas;

import java.util.Scanner;

public class condicion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("ingresa un numero");
		int Numero = sc.nextInt();
		
		
		if(Numero % 2 == 0) {
			
		System.out.println("es numero par");
			
				
		
		} else {
			System.out.println("es numero impar");
		
			
		}
		
		
	}

}
