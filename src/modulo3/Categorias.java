package modulo3;

import java.util.Scanner;

public class Categorias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		System.out.println("ingrese categoria a, b o c");
		
		String cat = sc.next();
		 
		 if(cat.equals("a")) {
			System.out.println("hijo");
			}
		 else if(cat.equals("b")) {  
			 System.out.println("padre");
			 }
		 else if (cat.equals("c")) 
			 System.out.println("abuelo");
		 }
	}
	


