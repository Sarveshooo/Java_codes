import java.util.*;

class Pattern4{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the rows: ");
		int rows = sc.nextInt();
		
		int num = (rows+1)*rows/2; 
		for(int i = 1; i<=rows; i++){

			for(int j=1; j<=rows-i+1; j++){
	
				System.out.print((char)(96+num)+" ");
				num--;
			}		
			System.out.println();
		}
	}
}


