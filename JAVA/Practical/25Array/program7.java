import java.util.*;


class ArrayDemo7{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.print("Enter the Element :");
		for(int i=0; i<arr.length; i++){

			arr[i] = sc.nextInt();
		}
		System.out.print("Elements are :\t");
		
		if(size%2==1 && size>=5){
			for(int i=0; i<arr.length; i++){
				if(arr[i]%2==1){

					System.out.print(arr[i]+"\t");
				}
			}
		}	
		else{
			for(int i=0; i<arr.length; i++){
				if(arr[i]%2==0){

					System.out.print(arr[i]+"\t");
				}
			}
		}		
		
	}
}
