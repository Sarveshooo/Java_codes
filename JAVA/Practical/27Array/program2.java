import java.util.*;

class ArrayDemo2{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of a array: ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.print("Enter the Element: ");
		for(int i=0; i<arr.length; i++){

			arr[i] =sc.nextInt();
		}
		int sumEven = 0;
		int sumOdd = 0;

		for(int i=1; i<arr.length; i++){

			if(arr[i]%2==0){
				
				sumEven += arr[i];

			}else{

				sumOdd += arr[i];
			}
		}
		System.out.println("Sum of even number is array is: "+sumEven);
		System.out.println("Sum of odd number in array is: "+sumOdd);
	

	}
}
