import java.io.*;

class Pattern12{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter rows: ");
		int rows = Integer.parseInt(br.readLine());

		for(int i=1; i<=rows; i++){

			int num =1;
			for(int sp=rows; sp>i; sp--){

				System.out.print("\t");
			}
			for(int j=1; j<=i*2-1; j++){

				if(j<i){

					System.out.print((num+=2) +"\t");
				}else{

					System.out.print((num-=2) +"\t");
				}
			}
			System.out.println();

		}

	}		
}