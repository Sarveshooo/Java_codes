import java.util.*;

class ArrayDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int count = 0;
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++){

			arr[i]=sc.nextInt();
		}
		System.out.print("Even numbers are: ");
		for(int i=0; i<arr.length; i++){

			if(arr[i]%2==0){

				System.out.println(arr[i]+" ");
				count++;
			}
		}
		System.out.println("Total even numbers: "+count);
	}


}
