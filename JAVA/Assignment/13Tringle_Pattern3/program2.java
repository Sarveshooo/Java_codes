import java.util.*;

class Pattern2{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the rows: ");
		int n = sc.nextInt();
		
		int num = 2; 
		for(int i = 1; i<=n; i++){

			for(int j=i; j<=n; j++){

				System.out.print(num +" ");
				num +=2;
			}
			System.out.println();
		}
	}
}

