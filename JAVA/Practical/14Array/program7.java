import java.io.*;
class ArrayDivisibility{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size for array: ");
		int size = Integer.parseInt(br.readLine());

		int[] arr = new int[size];
		for(int i=0; i<size; i++){

			System.out.print("Enter "+ (i+1) +" Element: :");
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Divisible by 4: ");
		for(int i=0; i<arr.length; i++){

			if(arr[i]%4==0){			
				System.out.println(arr[i]+" is divisible by 4 and it's index is "+ i);
			}
		}

	}
}
