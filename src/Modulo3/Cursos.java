package Modulo3;

import java.util.Scanner;

public class Cursos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc= new Scanner(System.in);

			System.out.println("Ingrese edad:");
			
			int edad = sc.nextInt();
			
			 if(edad == 0 ) {
				System.out.println("jardín de infantes");
				}
			 else if(edad >= 1 && edad <= 6) {  
				 System.out.println("primaria");
				 }
			 else if (edad >= 7 && edad <= 12) 
				 System.out.println("secundaria");
			 
	}

}
