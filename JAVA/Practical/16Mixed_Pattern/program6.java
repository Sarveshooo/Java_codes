import java.util.*;

class Pattern6{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter rows: ");
		int rows = sc.nextInt();

		for(int i =1; i<=rows; i++){
			int num= rows;

			for(int j=1; j<=i; j++){
 				if(i%2==0){

					System.out.print(num-- +" ");
				}else{

					System.out.print((char)(96 + num--) +" ");
				}
				
			}	
			System.out.println();

		}
	}
}
