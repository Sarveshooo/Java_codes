// d	5	f	7
// 8	i	10	k
// l	13	n	15
// 16	q	18i	s	rows=4;

import java.util.*;

class Pattern3{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows: ");
		int rows = sc.nextInt();

		int num = rows;
		for(int i=1; i<=rows; i++){

			for(int j=1; j<=rows; j++){

				if(j%2==0 && i%2==0){
					System.out.print((char)(96+num++) +"\t");
				}else if(j%2==0){

					System.out.print(num++ +"\t");
				}else if(i%2==0){

					System.out.print(num++ +"\t");
				}else{

					System.out.print((char)(96+num++) +"\t");
				}
			}
			System.out.println();

		}

	}
}
