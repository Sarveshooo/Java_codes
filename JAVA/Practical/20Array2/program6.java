import java.util.*;

class ProductDemo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		int product = 1;
		for(int i=0; i<arr.length; i++){

			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++){

			if(i%2==1){

				product *= arr[i];
			}
		}
		System.out.println("The prdouct of odd index number is :"+product);
	}


}
