import java.io.*;

class Pattern3{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter rows: ");
		int rows = Integer.parseInt(br.readLine());
		int num = 1;

		for(int i=1; i<=rows; i++){

			for(int sp=i; sp<rows; sp++){

				System.out.print("\t");
			}
			for(int j=1; j<=i; j++){

				System.out.print(num +"\t");
				num +=3;
			}
			System.out.println();
		}
		
	}
}
