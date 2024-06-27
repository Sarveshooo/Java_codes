import java.io.*;

class Palindrome{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number:");
		int num = Integer.parseInt(br.readLine());

		int tmp = num;
		int rem = 0;
		int rev = 0;
		while(num!=0){
			
			rem = num%10;
			rev = rev * 10 + rem;
			num /= 10;

		}
		if(rev == tmp ){

			System.out.println(tmp+" number is Palindrome number.");
		}

	}

}



