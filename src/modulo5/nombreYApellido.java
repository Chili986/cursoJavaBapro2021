package modulo5;

import java.util.Scanner;

public class nombreYApellido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
//		3- Realizar un programa que cree dos objetos de tipo String uno con el nombre y otro con el 
//		apellido y en un tercer objeto realizar la suma de los dos con un espacio en el medio (recordar 
//		que el objeto String es inmutable).
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese nombre:");
		String Nombre= sc.next();
		System.out.println("Ingrese apellido:");
		String Apellido= sc.next();
		String NmbreCompleto;
				
		NmbreCompleto = Nombre + " " + Apellido;
		
		
				System.out.println(NmbreCompleto.length());		
		
		
				
				
	}

}
