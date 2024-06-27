import java.util.*;

class ArrayDemo3{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();
		int count= 0;
		int arr[] = new int[size];
		System.out.print("Enter the Element :");
		for(int i=0; i<arr.length; i++){

			arr[i] = sc.nextInt();
		}
		System.out.print("Enter search element :\t");
		int search = sc.nextInt();
		for(int i=0; i<arr.length; i++){

			if(arr[i]==search){

				count++;
			}
		}
		if(count>0){
	
			System.out.println("Numer "+search+" Occured "+count+" times in an array");
		}else{

			System.out.println("number "+search+" not found in array.");
		}		
	}
}
