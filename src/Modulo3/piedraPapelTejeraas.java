package Modulo3;

import java.util.Scanner;

public class piedraPapelTejeraas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println("Piedra, Papel & tijeras");
		Scanner sc = new Scanner (System.in);
		
		 System.out.println("el jugador1:"); 
		 int Jugador1= sc.nextInt();
		 System.out.println("el jugador2:"); 
		 int Jugador2= sc.nextInt();
		 
		 if(Jugador1 == 0 && Jugador2 == 1)
			 System.out.println("papel envuelve piedra, Jugador2 Gana!");
		 else if(Jugador2 == 0 && Jugador1 == 1)
			 System.out.println("papel envuelve piedra, Jugador1 Gana!");
		 else if(Jugador1 == 1 && Jugador2 == 2)
			 System.out.println("tijera corta papel, Jugador2 Gana!");
		 else if(Jugador2 == 1 && Jugador1 == 2)
			 System.out.println("tijera corta papel Jugador1 Gana!");
		 else if(Jugador1 == 2 && Jugador2 == 0)
			 System.out.println("piedra rompe tijeras, Jugador2 Gana!");
		 else if(Jugador2 == 2 && Jugador1 == 0)
			 System.out.println("piedra rompe tijeras, Jugador1 Gana!");
		 else if(Jugador1 == 0 && Jugador2 == 0)
			 System.out.println("Empate!");
		 else if(Jugador2 == 1 && Jugador1 == 1)
			 System.out.println("Empate!");
		 else if(Jugador1 == 2 && Jugador2 == 2)
				 System.out.println("Empate!");
			 		 
 
	 
	}
	}

