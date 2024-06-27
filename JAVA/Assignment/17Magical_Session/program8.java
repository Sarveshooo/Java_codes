import java.util.*;

class SumOfRange{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter start point :");
		int num1=sc.nextInt();
		System.out.print("Enter End point :");
		int num2=sc.nextInt();
		int sum = 0;

		for(int i = num1; i<=num2;i++){

			 sum += i;
		}
		System.out.println("sum is :"+sum);
	}
}

