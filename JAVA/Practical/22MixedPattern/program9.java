import java.io.*;

class Pattern9{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter rows: ");
		int rows = Integer.parseInt(br.readLine());

		int tmp =rows;
		for(int i=1; i<=rows; i++){

			int num = tmp;
			for(int sp=rows; sp>i; sp--){

				System.out.print("\t");
			}
			for(int j=1; j<=i*2-1; j++){
	
				System.out.print(num-- +"\t");

			}
			System.out.println();
			tmp++;

		}
	}	
}		


