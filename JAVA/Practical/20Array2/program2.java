import java.util.*;

class ArrayDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int sum = 0;
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++){

			arr[i]=sc.nextInt();
		}
		System.out.print("Divisible numbers are: ");
		for(int i=0; i<arr.length; i++){

			if(arr[i]%3==0){

				System.out.println(arr[i]+" ");
				sum += arr[i];
			}
		}
		System.out.println("sum is: "+sum);
	}


}
