import java.util.*;

class ArrayDemo4{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size for array: ");
		int size = sc.nextInt();
		int count = 0;

		int arr[] = new int[size];
		System.out.print("Enter the Element: ");
		for(int i=0;i<arr.length; i++){

			arr[i] = sc.nextInt();
		}
		System.out.print("Enter the Number for search: ");
		int search = sc.nextInt();
		for(int i=0; i<arr.length; i++){

			if(arr[i]==search){
			
				count++;	
			}
		}
		if(count==2 || count>=2){
			System.out.print(search+" is occures more than 2 times in array.");
		}else{
			System.out.println(search+" is not occure in the array or occure only one time.");
		}

	}
}
