import java.io.*;

class Pattern5{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter no of Rows :");
		int rows = Integer.parseInt(br.readLine());
		
		for(int i = 1;i<=rows; i++){

			int num = i;
			for(int j=1; j<=i; j++){

				System.out.print(num*j+" ");
			}
			System.out.println();
		}
	}
}
