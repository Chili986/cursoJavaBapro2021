package Modulo3;

import java.util.Scanner;

public class Docenass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("numero:");
		Scanner sc = new Scanner(System.in);
	 int num = sc.nextInt();
	 System.out.println(num);
	 
	 if(num >= 1 && num <= 12 )
		 System.out.println(" Primera de docena");
		 else if(num >= 13 && num <= 24 )
		System.out.println("Segunda docena");
		 else if(num >= 1 && num <= 12 )
		 System.out.println(" Tercera docena");
		 else 
			 System.out.println("el numero " + num +" esta fuera de rango");
		 
	 
	 
	}

}
