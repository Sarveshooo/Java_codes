import java.io.*;

class Pattern7{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter rows: ");
		int rows = Integer.parseInt(br.readLine());

		for(int i=1; i<=rows; i++){

			for(int space=1; space<i; space++){

				System.out.print("\t");
			}
			for(int j=1; j<=rows-i+1; j++){

				System.out.print(j + "\t");
				
			}
			System.out.println();
		}
	}
}
