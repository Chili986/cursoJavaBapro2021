package Modulo3;

import java.util.Scanner;

public class ImprimirMayOr {
// no funciona
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
		
		System.out.println("ingresar el primer numero");
		int Num1= sc.nextInt();
		System.out.println("ingresar el segundo numero");
		int Num2= sc.nextInt();
		System.out.println("ingresar el tercer numero");
		int Num3= sc.nextInt();
		
		if(Num1 > Num2 ||  Num1 > Num3)
			System.out.println("El maximo valor es:"+" "+ Num1);
		else if(Num2 > Num1 || Num2 > Num3)
			System.out.println("El maximo valor es:"+" "+ Num2);
		else if(Num3 > Num1 || Num3 > Num2)
			System.out.println("El maximo valor es:"+" "+ Num3);

	}

}
