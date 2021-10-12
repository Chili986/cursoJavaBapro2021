package Modulo3;

import java.util.Scanner;

public class Medallas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);

		System.out.println("Posicion: Primero, Segundo, Tercero u otra");
		
		String posicion = sc.next();
		 
		 if(posicion.equals("Primero")) {
			System.out.println("Madella de oro");
			}
		 else if(posicion.equals("Segundo")) {  
			 System.out.println("Medalla de plata");
			 }
		 else if (posicion.equals("Tercero")) 
			 System.out.println("Medalla de bronce");
		 else if (posicion.equals("otra")) 
			 System.out.println("segui participando");
		 }
	     
		 		
		 
			 
        
        
        
	}


