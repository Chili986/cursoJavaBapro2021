package Modulo3;

import java.util.Scanner;

public class Switcheje5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("ingrese cantidad de dias:");
		  Scanner sc= new Scanner(System.in);

			System.out.println("Posicion: Primero, Segundo, Tercero u otra");
			
			String posicion = sc.next();
			
	       switch(posicion) { 
    
	       		case  "Primero":	 
	       					{   
	       						System.out.println("Madella de oro"); 
		  
		  break;
		  			}
		  
		  
  
	case  "Segundo":		  
	  {   
		  System.out.println("Medalla de plata"); 
		
		  break;
	  
}
	case  "Tercero":		  
{   
		  System.out.println("Medalla de bronce");

}
	case  "otra":		  
	{   
			System.out.println("segui participando");

	}
}
	}

}
