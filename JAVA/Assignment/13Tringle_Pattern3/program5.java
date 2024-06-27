import java.util.*;

class Pattern5{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the rows: ");
		int n = sc.nextInt();
		 
		for(int i = 1; i<=n; i++){

			for(int j=1; j<=n-i+1; j++){

				if(i%2==0){

						System.out.print((char)(96+j)+" ");
					
				}else{
						System.out.print((char)(64+j)+" ");
				}

			}
			System.out.println();
		}
	}
}


