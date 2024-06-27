import java.util.*;

class MaxNumber{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++){

			arr[i]=sc.nextInt();
		}
		int max = arr[0];
	
		for(int i=1; i<arr.length; i++){

			if(arr[i]>max){
				max = arr[i];
			}
			
		}
		System.out.println("Maximum number :"+max);
		
	}

}

