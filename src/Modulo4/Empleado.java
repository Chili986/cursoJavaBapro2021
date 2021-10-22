package Modulo4;

import java.util.Scanner;

public class Empleado {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese categoria:");
		char categoria = sc.next().charAt(0);
		System.out.println("Ingrese antiguedad");
		int antiguedad = sc.nextInt();
		System.out.println("Ingrese sueldo");
		int sueldo = sc.nextInt();
		int incrXAnti=0;
		int incrXCat=0;
		int sueldoNeto=0;
		
		if(antiguedad >= 1 && antiguedad <= 5 )
			incrXAnti = sueldo * 5 / 100 + sueldo;
     	if(antiguedad >= 6 && antiguedad <= 10 )
			incrXAnti = sueldo * 10 / 100 + sueldo;
		 if(categoria == 'a')
				incrXCat = 1000;
		 if(categoria == 'b')
				incrXCat =  2000;
		 if(categoria == 'c')
				incrXCat = 3000;
		 
		 sueldoNeto= incrXAnti + incrXCat;
					
			System.out.println("Se incrementa tu sueldo a: " + incrXAnti + " mas un plus de " + incrXCat + " total "+ sueldoNeto);
		
		
	}

}
