import java.io.*;

class Reverse{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number:");
		int num = Integer.parseInt(br.readLine());

		int rem = 0;
		int rev = 0;
		while(num!=0){
			
			rem = num%10;
			rev = rev * 10 + rem;
			num /= 10;

		}
		System.out.println(rev);

	}

}


