import java.io.*;

class Pattern4{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter rows: ");
		int rows = Integer.parseInt(br.readLine());

		for(int i=1; i<=rows; i++){
			int num = 1;
			for(int sp=1; sp<i; sp++){

				System.out.print("\t");
				num++;
			}
			for(int j=1; j<=rows-i+1; j++){

				System.out.print((char)(64+num) +"\t");
				num++;
			}
			System.out.println();
		}
		
	}
}
