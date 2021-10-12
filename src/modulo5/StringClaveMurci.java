package modulo5;

import java.util.Scanner;

public class StringClaveMurci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ingrese texto...");
		Scanner sc = new Scanner(System.in); 
		
		String TextoOr = sc.nextLine();
		String TextoMay = TextoOr.toUpperCase();
		String TextoMin = TextoOr.toLowerCase();
		String TextReem = TextoOr.replace('o','0');
	
		System.out.println("mayuscula:"+" "+TextoMay);
		System.out.println("minuscula:"+" "+TextoMin );
		System.out.println("Reemplazo:"+" "+TextReem);
		
		
		
	}

}
