import java.io.*;

class Pattern2{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Rows: ");
		int rows = Integer.parseInt(br.readLine());

		for(int i=1; i<=rows; i++){

			for(int space=i; space<rows; space++){

				System.out.print("  ");
			}
			for(int j=rows; j>=rows-i+1; j--){

				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}
}
