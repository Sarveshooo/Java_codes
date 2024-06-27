import java.util.*;

class SumDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		int sum = 0;
		for(int i=0; i<arr.length; i++){

			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++){

			if(i%2==1){

				sum += arr[i];
			}
		}
		System.out.println("The sum of odd index number is :"+sum);
	}


}
