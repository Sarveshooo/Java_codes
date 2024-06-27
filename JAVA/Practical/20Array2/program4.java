import java.util.*;

class SearchDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++){

			arr[i]=sc.nextInt();
		}
		System.out.print("Enter number to be searched: ");
		int search = sc.nextInt();

		for(int i=0; i<arr.length; i++){

			if(arr[i]==search){

				System.out.println(arr[i]+" found at index "+i);
			}
		}
	}


}
