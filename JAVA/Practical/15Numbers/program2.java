import java.io.*;

class Prime{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number:");
		int num = Integer.parseInt(br.readLine());

		int tmp = 1;
		int count = 0;

		while(tmp<=num){

			if(num%tmp==0){

				count++;
			}
			tmp++;
		}
		if(count==2){
			System.out.println(num+" is a prime number.");
		}
	}

}

