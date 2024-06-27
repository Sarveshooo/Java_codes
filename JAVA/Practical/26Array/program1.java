import java.util.*;

class ArrayDemo1{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size for array: ");
		int size = sc.nextInt();
		int average = 0;

		int arr[] = new int[size];
		System.out.print("Enter the Element: ");
		for(int i=0;i<arr.length; i++){

			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length; i++){

			average += arr[i];
		}
		System.out.print("Avereage of an Array is: "+average/size);

	}
}
