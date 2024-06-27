import java.util.*;

class ArrayDemo10{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size for array: ");
		int size = sc.nextInt();
		int max = 0;
		int secMax = 0;
		int thirdMax = 0;

		int arr[] = new int[size];
		System.out.print("Enter the Element: ");
		for(int i=0;i<arr.length; i++){

			arr[i] = sc.nextInt();
		}
		secMax = arr[0];
		max = arr[0];
		for(int i=1; i<arr.length; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		for(int i=1; i<arr.length; i++){
			if(arr[i]>secMax){
				if(arr[i]==max){
				
					continue;	
				}else{
					secMax = arr[i];
				}
			}
		}
		for(int i=1; i<arr.length; i++){
			if(arr[i]>thirdMax){
				if(arr[i]==max ||arr[i]==secMax){
				
					continue;	
				}else{
					thirdMax = arr[i];
				}
			}
		}
		System.out.print("The third largest number in array is :"+thirdMax);

	}
}
