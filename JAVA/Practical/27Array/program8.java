import java.util.*;

class ArrayDemo8{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size for array: ");
		int size = sc.nextInt();
		int min = 0;
		int secMin = 0;

		int arr[] = new int[size];
		System.out.print("Enter the Element: ");
		for(int i=0;i<arr.length; i++){

			arr[i] = sc.nextInt();
		}
		secMin = arr[0];
		min = arr[0];
		for(int i=1; i<arr.length; i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		for(int i=1; i<arr.length; i++){
			if(arr[i]<secMin){
				if(arr[i]==min){
				
					continue;	
				}else{
					secMin = arr[i];
				}
			}
		}
		System.out.print("The second Minimum number in array is :"+secMin);

	}
}

