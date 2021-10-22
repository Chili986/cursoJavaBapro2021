package Modulo4;

import java.util.Scanner;

public class SumaDePaloresPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Tabla de:");
	  	Scanner sc = new Scanner (System.in);
	       int num = sc.nextInt();
		  	
      		

	    	for (int i = 1;i<=10 ;i ++) {
	    	
	    		if(i % 2 == 0)
	    			
	    	 System.out.println(num + "x" + i + "=" +(num*i) );
	       	 
	    	}
	    	
	    	System.out.println("\n Otra tabla de:");
	    	  int num1 = sc.nextInt();
	    	  
	    	for (int i = 1;i<=10 ;i = i + 2) {
		    	
	    			
	    	 System.out.println(num1 + "x" + i + "=" +(num1*i) );
	       	 
	    	}
	    	  
	    	 	
			
   		   
	
    		   
	}

}
