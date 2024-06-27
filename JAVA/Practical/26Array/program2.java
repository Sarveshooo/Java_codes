import java.util.*;

class ArrayDemo2{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size for array: ");
		int size = sc.nextInt();
		int difference = 0;
		int min = 0;
		int max = 0;

		int arr[] = new int[size];
		System.out.print("Enter the Element: ");
		for(int i=0;i<arr.length; i++){

			arr[i] = sc.nextInt();
		}
		min = arr[0];
		max = arr[0];
		for(int i=1; i<arr.length; i++){

			if(arr[i]>max){
				
				max = arr[i];
			}
			if(arr[i]<min){
			
				min = arr[i];
			}
		}
		difference = max - min;
		System.out.print("Diffrence between maximum number and minmum number is: "+difference);

	}
}
