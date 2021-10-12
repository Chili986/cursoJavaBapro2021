package Modulo3;

import java.util.Scanner;

public class Meses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ingrese cantidad de dias:");
		  
	    
		Scanner sc = new Scanner (System.in);
	       int dias = sc.nextInt();
	       
	       if(dias == 30)
	    	   System.out.println("Noviembre, Abril, Junio o Septiembre ");
	       
	       else if (dias == 31)
	    	   System.out.println("Enero, Marzo, Mayo, Julio, Agosto, Octubre o Diciembre");
	       else
	    	   System.out.println("febrero");
		
	}

}
