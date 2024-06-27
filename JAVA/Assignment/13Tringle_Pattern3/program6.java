import java.util.*;

class Pattern6{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the rows: ");
		int n = sc.nextInt();
		 
		for(int i = 1; i<=n; i++){

			int num = 1;
			for(int j=1; j<=n-i+1; j++){
			

				if(j%2==0){

						System.out.print((char)(96+num)+" ");
						num++;
					
				}else{
						System.out.print(num+" ");
				}

			}
			System.out.println();
		}
	}
}



