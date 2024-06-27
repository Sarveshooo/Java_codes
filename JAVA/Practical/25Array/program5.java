import java.util.*;

class ArrayDemo5{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.print("Enter the Element :");
		for(int i=0; i<arr.length; i++){

			arr[i] = sc.nextInt();
		}
		System.out.print("Elements are :\t");
		for(int i=0; i<arr.length; i++){

			if(arr[i]<0){

				arr[i] = arr[i]*arr[i];
			}
		}
		for(int i=0; i<arr.length; i++){

			System.out.print(+arr[i]+"\t");

		}
	}
}
