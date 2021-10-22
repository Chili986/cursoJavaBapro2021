package Modulo4;


import java.util.Scanner;

public class NumAlAzar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			
			int num []=  new int [10];
			int i = 0;
			int suma = 0; 
				
			
		        while(i < 10 ) {
				num [i]= (int)(Math.random()*10);	
				suma= suma +num [i];
				System.out.println(num[i]);
				
					i++;
					
					
				}
				 
				
				System.out.println("suma total "+ suma);
				System.out.println("Promedio gral:" + suma/10);
				}

}
