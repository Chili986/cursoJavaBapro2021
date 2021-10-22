package Modulo4;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0 ;
		int num []=  new int [10];
		int max = num[0];
		int min = num[0]; 
		int contador=0;
		
		do {
			
					
					num [i]=(int)(Math.random()*30);
						contador = contador + num[i];
					for (int j = 0; j < num.length; j++){
						if (max < num[j])
							max = num[j];
						if (min > num[j])
							min = num[j];	
						
						System.out.println("minimo:" + min);
						System.out.println( "Maximo:" + max);
						j++;
		}		
		}

	        while( num[i] <= 10); 
		
		

		}
	
}