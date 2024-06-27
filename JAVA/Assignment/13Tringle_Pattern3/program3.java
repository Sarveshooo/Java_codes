import java.util.*;

class Pattern3{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the rows: ");
		int n = sc.nextInt();
		
		int num = n * (n+1); 
		for(int i = 1; i<=n; i++){

			for(int j=1; j<=n-i+1; j++){

				System.out.print(num +" ");
				num -=2;
			}
			System.out.println();
		}
	}
}


