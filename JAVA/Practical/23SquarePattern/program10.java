// 16	@	14	@
// 24	@	20	@
// 24	@	18	@
// 16	@	8	@	rows=4;
import java.util.*;

class Pattern10{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows: ");
		int rows = sc.nextInt();
		 
		int num = rows*rows;
		for(int i=1; i<=rows; i++){
			
			for(int j=1; j<=rows; j++){

				if(j==i){

					System.out.print("&\t");
				}else{
					System.out.print(num*j +"\t");
				}
				num--;
			}
			System.out.println();

		}

	}
}
