import java.util.*;

class ArrayDemo4{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of a array: ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.print("Enter the Element: ");
		for(int i=0; i<arr.length; i++){

			arr[i] =sc.nextInt();
		}
		int flag = 0;

		for(int i=0; i<arr.length; i++){

			for(int j=0; j<arr.length; j++){

				if(arr[i]==arr[j] && i!=j){

					System.out.println("first duplicate elemnt founded at index "+i);
					flag =1;
					break;
				}
			}
			if(flag==1){
			
				break;
			}
		}

	}
}
