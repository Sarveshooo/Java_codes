import java.io.*;

class Pattern3{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Rows: ");
		int rows = Integer.parseInt(br.readLine());

		for(int i=rows; i>=1; i--){
			int num=i;
	
			for(int space=i; space>1; space--){

				System.out.print("  ");
				
			}
			for(int j=rows; j>=i; j--){
	
				
				System.out.print( (char)(64 + num++) + " ");
			}
			System.out.println();
		}
	}
}
