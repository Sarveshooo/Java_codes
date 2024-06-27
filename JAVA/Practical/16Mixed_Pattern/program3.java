import java.util.*;

class Pattern3{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter rows: ");
		int rows = sc.nextInt();

		for(int i =1; i<=rows; i++){
			int num= 1;

			for(int j=rows; j>=1; j--){
 
				if(i%2==0){
					System.out.print(num++ +" ");
				}else{
					System.out.print((char)(64 + j)+" ");
				}
			}	
			System.out.println();

		}
	}
}
