// 4	&	5	&
// 6	6	6	6
// 6	&	7	&
// 8	8	8	8	rows=4;
import java.util.*;

class Pattern5{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows: ");
		int rows = sc.nextInt();

		int num =rows;
		for(int i=1; i<=rows; i++){

			for(int j=1; j<=rows; j++){

				if(i%2==1){
					
					if(j%2==0){

						System.out.print("&\t");
					}else{
						System.out.print(num++ +"\t");
					}
				}else{
				
					System.out.print(num +"\t");
				}
			}
			System.out.println();

		}

	}
}
