// D	e	f	g
// H	i	j	k
// L	m	n	o
// P	q	r	s	rows=4;

import java.util.*;

class Pattern1{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows: ");
		int rows = sc.nextInt();

		int num = rows;
		for(int i=1; i<=rows; i++){

			for(int j=1; j<=rows; j++){

				if(j==1){
					
					System.out.print((char)(64+num) +"\t");
				}else{

					System.out.print((char)(96+num) +"\t");
				}
				num++;
			}
			System.out.println();

		}

	}
}
