import java.util.*;

class Number10{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number: ");
		int num = sc.nextInt();
		int tmp1 = num;
		int rem = 0;
		int rev = 0;
		
		while(num!=0){

			rem = num%10;

			rev = rev * 10 + rem;

			num /= 10;
		}
		System.out.println("Reverse of "+tmp1+" is :"+rev);

		int tmp2 = rev;
		while(rev!=0){
		
			rem = rev%10;

			if(rem%2!=0){

				System.out.println("Square of "+rem+" is :"+rem*rem);
			}

			rev /=10;
		}
	}
}
