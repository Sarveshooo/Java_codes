import java.util.*;

class ArrayDemo5{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size for array: ");
		
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter the Element: ");
		for(int i=0;i<arr.length; i++){

			arr[i] = sc.nextInt();
		}
		int start = 0;
		int end = size-1;
		System.out.println("Reverse Elements are");
		for(int i=0; i<arr.length; i++){
			
			if(start<end){
				int tmp;
				tmp = arr[start];
				arr[start] = arr[end];
				arr[end] = tmp;
		
				start++;
				end--;
			}

			System.out.println(arr[i]+"\t");
		}
	}
}
