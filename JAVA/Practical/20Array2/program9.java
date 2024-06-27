import java.util.*;

class MinNumber{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++){

			arr[i]=sc.nextInt();
		}
		int min = arr[0];
	
		for(int i=1; i<arr.length; i++){

			if(arr[i]<min){
				min = arr[i];
			}
			
		}
		System.out.println("Minimum number :"+min);
		
	}

}

