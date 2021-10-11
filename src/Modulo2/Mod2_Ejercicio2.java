package Modulo2;

public class Mod2_Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte bmin = -128; // 2^7 
		byte bmax = 127; //2^7 -1
		// reemplazar el 0 por el valor que corresponda en todos los caso
		short smin = Short.MIN_VALUE;//-2^15
		short smax = Short.MAX_VALUE; // 2^15 -1	
		int imax = Integer.MAX_VALUE;// -2^31  
		int imin = Integer.MIN_VALUE;//2^31 -1
		long lmax = Long.MAX_VALUE;//-2^63 
		long lmin = Long.MIN_VALUE;//2^63 -1
		System.out.println("tipo\tminimo\tmaximo");
		System.out.println("....\t......\t......");
		System.out.println("\nbyte\t" + bmin + "\t" + bmax);
		System.out.println("\nshort\t" + smin + "\t" + smax);
		System.out.println("\nint\t" + imin + "\t" + imax);
		System.out.println("\nlong\t" + lmin + "\t" + lmax);
	
	}

}
