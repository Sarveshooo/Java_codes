import java.io.*;

class Pattern3{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter row number :");
		int rows = Integer.parseInt(br.readLine());

		for(int i=1; i<=rows; i++){

			int num = rows;
			for(int j=1; j<=i; j++){

				System.out.print((char)(64 + num--)+" ");
			}
			System.out.println();
		}
	}
}

