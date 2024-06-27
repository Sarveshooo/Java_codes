import java.util.*;

class ArrayDemo6{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();

		char arr[] = new char[size];
		System.out.print("Enter the Element :");
		for(int i=0; i<arr.length; i++){

			arr[i] = sc.next().charAt(0);
		}
		System.out.print("Consonent are :\t");
		for(int i=0; i<arr.length; i++){

			if(arr[i]=='a' || arr[i]=='e' || arr[i]=='a' || arr[i]=='a' || arr[i]=='u'){

				continue;
			}
			System.out.print(arr[i]+"\t");
		}
	}
}
