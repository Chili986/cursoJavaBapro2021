package operacionesLogicas;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("ingresar nota1");
		float nota1= sc.nextFloat();
		System.out.println("ingresar nota2");
		float nota2= sc.nextFloat();
		System.out.println("ingresar nota 3");
		float nota3= sc.nextFloat();
		
		
		
		float promedio= (nota1+nota2+nota3)/3;		
		
		if(promedio >= 7)
			System.out.println("Aprobado con" + " " + promedio );
		else 
			System.out.println("Reprobado con" + " " + promedio);
		
		
		
		
		 		
		
		
	}

}
