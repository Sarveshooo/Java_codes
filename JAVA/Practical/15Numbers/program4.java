import java.io.*;

class Factorial{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number:");
		int num = Integer.parseInt(br.readLine());

		int tmp = num;
		int fact = 1;

		while(tmp>=1){

			fact *= tmp;
			tmp--;
		}
		System.out.println("Factorial of "+num+" is "+fact);
		
	}

}


