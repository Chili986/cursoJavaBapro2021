package Modulo3;

import java.util.Scanner;

public class Switcheje3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ingrese cantidad de dias:");
		Scanner sc = new Scanner (System.in);
	       int dias = sc.nextInt();
		
	       switch(dias) { 
    
	       		case  30:	 
	       					{   
		  System.out.println("Noviembre, Abril, Junio o Septiembre "); 
		  
		  break;
		  			}
		  
		  
  
	case  31:		  
	  {   
		  System.out.println("Enero, Marzo, Mayo, Julio, Agosto, Octubre o Diciembre"); 
		
		  break;
	  
}
	case  28:		  
{   
		System.out.println("febrero"); 

}
}
  	}

}
