import java.util.*;

class ArrayDemo2{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.print("Enter the Element :");
		for(int i=0; i<arr.length; i++){

			arr[i] = sc.nextInt();
		}
		System.out.print("Enter search element :\t");
		int search = sc.nextInt();
		for(int i=0; i<arr.length; i++){

			if(arr[i]==search){
				System.out.println("num "+search+" first occured at index: "+i);
				break;
			}
			if(arr[i]!=search){

				System.out.println("num "+search+" is not found in array.");
				break;
			}

		}		
	}
}
