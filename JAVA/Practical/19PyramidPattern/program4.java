import java.io.*;

class Pattern4{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter rows: ");
		int rows = Integer.parseInt(br.readLine());

		int num=1;
		for(int i=1; i<=rows; i++){

			for(int sp=rows; sp>i; sp--){

				System.out.print("\t");
			}
			for(int j=1; j<=i*2-1; j++){

			
					System.out.print((char)(64+num) +"\t");
			}
			System.out.println();
			num++;

		}

	}		
}
