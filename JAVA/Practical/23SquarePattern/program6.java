// 16	@	14	@
// 24	@	20	@
// 24	@	18	@
// 16	@	8	@	rows=4;
import java.util.*;

class Pattern6{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows: ");
		int rows = sc.nextInt();
		 
		for(int i=1; i<=rows; i++){
			
			int num = rows*rows;
			for(int j=1; j<=rows; j++){

				if(i%2==1){

					System.out.print(num +"\t");
					num--;
				}else{
					if(j%2==1){
						System.out.print(num +"\t");
					}else{

						num -=5;
						System.out.print(num +"\t");
					}
				}
			}
			System.out.println();

		}

	}
}
