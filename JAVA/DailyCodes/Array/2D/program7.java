import java.util.*;
class ArrayDemo{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("Size of an array is: "+ arr.length);

		for(int i=0; i<arr.length; i++){

			System.out.print("Enter: ");
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++){

			System.out.println(arr[i]);
		}
		
	}
}