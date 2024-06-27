import java.util.*;

class Pattern2{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter rows: ");
		int rows = sc.nextInt();
		int num = rows;

		for(int i =1; i<=rows; i++){								//C3 C2 C1
													//C4 C3 C2
													//C5 C4 C2
			for(int j=rows; j>=1; j--){
 
				System.out.print((char)(64 + rows)+""+ num-- +" ");
			}	
			System.out.println();
			num = rows+i;

		}
	}
}
