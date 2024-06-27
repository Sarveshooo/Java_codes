import java.util.*;

class ArrayDemo3{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of a array: ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.print("Enter the Element: ");
		for(int i=0; i<arr.length; i++){

			arr[i] =sc.nextInt();
		}
		int flag = 0;

		for(int i=1; i<arr.length/2; i++){

			if(arr[i]==(arr[arr.length-i-1])){


			}else{

				flag = 1;
			}
		}
		if(flag == 0){

			System.out.println("Array is in Palindrome");
		}else{
			System.out.println("Array is not in Palindrome");
		}

	}
}
