package Modulo3;

import java.util.Scanner;

public class Autos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Categorias de autos");
		Scanner sc = new Scanner(System.in);
		
		char carac = sc.next().charAt(0); 
		
		
		  switch(carac) { 
		    
     		case  'a':	 
     					{   
     						System.out.println("tienen 4 ruedas y un motor"); 
	  
	  break;
	  			}
	  
	  

              case  'b':		  
{   
	                       System.out.println("4 ruedas, un motor, cierre centralizado y aire"); 
	
	  break;

}
              case  'c':		  
{   
	                         System.out.println("4 ruedas, un motor, cierre centralizado, aire, airbag");

}
           
}

	}

}
