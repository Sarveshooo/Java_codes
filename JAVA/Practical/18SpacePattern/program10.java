import java.io.*;

class Pattern10{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter rows: ");
		int rows = Integer.parseInt(br.readLine());

		for(int i=1; i<=rows; i++){

			int num = 1;
			for(int space=1; space<i; space++){

				System.out.print("\t");
				num++;
			}
			for(int j=1; j<=rows-i+1; j++){

				if(num%2==0){

				System.out.print((char)(64+ num++ ) + "\t");
				}else{

					System.out.print((64+ num++ )+ "\t");
				}
				
			}
			System.out.println();
		}
	}
}
