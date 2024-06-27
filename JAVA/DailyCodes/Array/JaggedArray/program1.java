import java.util.*;

class JaggedArray{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row :");
		int row = sc.nextInt();
		System.out.print("Enter col :");
		int col = sc.nextInt();

		int arr[][] = new int[row][col];
		for(int i=0; i<arr.length; i++){

			for(int j=0; j<arr[i].length;j++){

				System.out.print("enter element :");

				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Element are: ");		
		for(int i=0; i<arr.length; i++){

			for(int j=0; j<arr[i].length;j++){

				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

