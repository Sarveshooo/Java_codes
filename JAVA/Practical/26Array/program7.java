import java.util.*;

class ArrayDemo7{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size for array: ");
		int size = sc.nextInt();

		char arr[] = new char[size];
		System.out.print("Enter the Element: ");
		for(int i=0;i<arr.length; i++){

			arr[i] = sc.next().charAt(0);
		}
		for(int i=0; i<arr.length; i++){

			if(arr[i]<=122 && arr[i]>=97){
			
				arr[i]= (char)(arr[i] - 32);
			}
			System.out.print(arr[i] +"\t");

		}

	}
}
