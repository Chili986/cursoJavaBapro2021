package Modulo4;


import java.util.Scanner;

public class TablaDeMulti {

	public static void main(String[] args) {

		System.out.println("ingresela tabla que desee saber:");
		Scanner sc = new Scanner (System.in);
	       int num = sc.nextInt();
	  	
	       		

	    	for (int i = 1;i<=10 ;i++) {
	    		
	    	 System.out.println(num + "x" + i + "=" +(num*i));
	    	  
	    	 	
	    	}
	    	  
		
	}

}
