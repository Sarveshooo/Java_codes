import java.io.*;

class Factors{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number:");
		int num = Integer.parseInt(br.readLine());

		int tmp = 1;

		while(tmp<=num){

			if(num%tmp==0){

				System.out.println(tmp);
			}
			tmp++;
		}
	}

}
