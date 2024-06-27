import java.util.*;

class EvenRange{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter start point :");
		int num1=sc.nextInt();
		System.out.print("Enter End point :");
		int num2=sc.nextInt();

		for(int i = num1; i<=num2;i++){

			if(i%2==0){
				
				System.out.println(i+" ");
			}
		}
	}
}

