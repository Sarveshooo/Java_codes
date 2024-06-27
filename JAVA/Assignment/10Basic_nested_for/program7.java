import java.util.*;
class Pattern7{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Rows :");
		int rows = sc.nextInt();
		for(int i = 1; i<=rows; i++){
			int num = rows;

			for(int j = 1;j<=rows; j++){

				System.out.print((char)(96+num) +" "); 
				num--;
			}
			System.out.println();
		}
	}
}


