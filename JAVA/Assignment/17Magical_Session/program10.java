import java.util.*;

class Marks{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter marks in maths :");
		int num1=sc.nextInt();
		System.out.print("Enter marks in English :");
		int num2=sc.nextInt();
		System.out.print("Enter marks in Science :");
		int num3=sc.nextInt();
		System.out.print("Enter marks in Marathi :");
		int num4=sc.nextInt();

		int total = num1+num2+num3+num4;
		System.out.println(total+" out of 400.");
	}
}

