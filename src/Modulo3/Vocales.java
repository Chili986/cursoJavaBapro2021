package Modulo3;

import java.util.Scanner;

public class Vocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ingresa texto");
		Scanner sc = new Scanner(System.in);
		
		char caracter = sc.next().charAt(0);
	    
	    
	    
	   if (caracter != 'a' || caracter !='e' || caracter != 'i' || caracter !='o' ||caracter != 'u')
		    System.out.println(" No es una vocal");
	   else 
		   System.out.println("Es una vocal");
	}}
			

