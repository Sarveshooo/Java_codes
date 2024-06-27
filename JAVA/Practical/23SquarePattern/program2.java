// d	e	f	G
// h	i	J	K
// l	m	N	O
// P	Q	R	S	rows=4;

import java.util.*;

class Pattern2{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows: ");
		int rows = sc.nextInt();

		int num = rows;
		for(int i=1; i<=rows; i++){

			for(int j=rows; j>i; j--){

				System.out.print((char)(96+num++) +"\t");
			}
			for(int j=1; j<=i; j++){
				
				System.out.print((char)(64+num++) +"\t");
			}
			System.out.println();

		}

	}
}
