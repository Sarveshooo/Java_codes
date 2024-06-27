import java.io.*;

class Pattern6{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the no of rows :");
		int rows = Integer.parseInt(br.readLine());

		for(int i =1; i<=rows; i++){

			int num = rows-i+1;
			for(int j=1; j<=num; j++){

				System.out.print(num+" ");
			}
			System.out.println();
		}
	}

}
