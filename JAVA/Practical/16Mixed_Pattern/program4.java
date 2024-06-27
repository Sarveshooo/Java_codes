import java.util.*;

class Pattern4{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter rows: ");
		int rows = sc.nextInt();

		for(int i =rows; i>=1; i--){
			int num= i;

			for(int j=i; j<=rows; j++){
 					System.out.print(num +" ");
					num += i;
				
			}	
			System.out.println();

		}
	}
}
