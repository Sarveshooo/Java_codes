import java.io.*;


class Pattern9{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter rows: ");

		int rows = Integer.parseInt(br.readLine());
		int num =rows *(rows+1);
		for(int i = 1; i<=rows; i++){
			
			for(int j=1; j<=rows-i+1; j++){
				
				System.out.print(--num +" ");
				--num;	
				
			}
			System.out.println();
		}
	}
}
