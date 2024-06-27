import java.util.*;

class Divisibility{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = sc.nextInt();

		if(num % 16 == 0){
	
			System.out.println(num +"Number is divisible by 16.");
		}else{

			System.out.println(num +" Number is not divisible by 16.");
	}
	}
}	
