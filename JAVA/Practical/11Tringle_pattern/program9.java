import java.io.*;

class Pattern9{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the no of Rows :");
		int rows = Integer.parseInt(br.readLine());

		for(int i = 1; i<= rows; i++){

			int num = rows;
			for(int j=1; j<=rows-i+1; j++){

				System.out.print((char)(64+num--)+" ");
			}
			System.out.println();		}
	}
	
}

