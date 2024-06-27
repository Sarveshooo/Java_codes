// 15	25	35	49
// 64	81	100	121
// 143	169	195	225
// 256	289	324	361	rows=4;
import java.util.*;

class Pattern7{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows: ");
		int rows = sc.nextInt();
		
		int num = rows; 
		for(int i=1; i<=rows; i++){

			for(int j=1; j<=rows; j++){

				if(i%2==1 && j%2==1){

					System.out.print((num*num)-1 +"\t");
					num++;
				}else{

					System.out.print(num*num +"\t");
					num++;
				}
			}
			System.out.println();

		}

	}
}
