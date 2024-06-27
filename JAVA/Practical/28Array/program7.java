import java.util.*;

class ArrayDemo7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

	System.out.println("Modified array:");
	for(int i=0; i<arr.length; i++){

		if(arr[i]>64 && arr[i]<91){

			System.out.println((char)arr[i]);
		}else{

			System.out.println(arr[i]);
		}
	}
    }
}
