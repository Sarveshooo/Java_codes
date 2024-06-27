import java.io.*;

class Pattern10{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter rows: ");
		int rows = Integer.parseInt(br.readLine());

		int num = 1;
		for(int i=1; i<=rows; i++){

			for(int sp=rows; sp>i; sp--){

				System.out.print("\t");
			}
			for(int j=1; j<=i*2-1; j++){

				if(j<i){

					System.out.print(num+"\t");
					num--;
				}else{

					System.out.print(num+"\t");
					num++;
				}
				


			}
			System.out.println();

		}
	}	
}		


