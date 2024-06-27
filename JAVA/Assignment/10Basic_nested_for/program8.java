import java.util.*;
class Pattern8{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Rows :");
		int rows = sc.nextInt();	
		int n = 1;
		char ch = 'C';
		for(int i = 1; i<=rows; i++){

			for(int j = 1;j<=rows; j++){

				System.out.print(ch+""+(n) +" ");
			       n++;	
			}
			System.out.println();
		}
	}
}


