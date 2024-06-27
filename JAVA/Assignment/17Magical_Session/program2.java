import java.util.Scanner;

class Eligibile{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the age :");
		int age = sc.nextInt();

		if(age>=0){
	
			if(age>=18){

				System.out.println("Voter is eligible for voting.");
			}else{

				System.out.println("Voter is not eligible for voting.");
			}

		}else{

			System.out.println(age+" is a invalid age. Please enter valid one.");
		}
	}
}
