import java.io.*;

class Pattern5{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter rows: ");
		int rows = Integer.parseInt(br.readLine());
		
		int num = rows;
		for(int i=1; i<=rows; i++){

			for(int j=1; j<=rows; j++){

				if(i%2==1){

					System.out.print(num*num +"\t");
					num++;
				}
				else{

					System.out.print(num++ +"\t");
				}
			}
			System.out.println();
		}
		
	}
}
