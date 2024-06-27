import java.util.*;

class Pattern9{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter rows: ");
		int rows = sc.nextInt();

		int num = 0;
		for(int i =1;i<=rows; i++){

			for(int j=1; j<=rows-i+1; j++){
 				if(i%2==0){

					System.out.print((char)(64 + num--) +" ");
				}else{

					System.out.print(j+" ");
					num = j-1;
				}
				
			}	
			System.out.println();

		}
	}
}
