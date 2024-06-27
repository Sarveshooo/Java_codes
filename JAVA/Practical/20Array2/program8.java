import java.util.*;

class NumberDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++){

			arr[i]=sc.nextInt();
		}
		System.out.println("Arrays Element are:");
	
		for(int i=0; i<arr.length; i++){

			if(arr[i]>5 && arr[i]<9){
				System.out.println(arr[i]+" is a greater than 5 but less than 9.");
			}
			
		}
		
	}

}

