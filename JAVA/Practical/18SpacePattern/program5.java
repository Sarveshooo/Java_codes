import java.io.*;

class Pattern5{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter rows: ");
		int rows = Integer.parseInt(br.readLine());

		for(int i=1; i<=rows; i++){

			int num = i;
			for(int space=i; space<rows; space++){

				System.out.print(" \t");
			}
			for(int j=1; j<=i; j++){

				System.out.print(num+ "\t");
				num += i;
				
			}
			System.out.println();
		}
	}
}
