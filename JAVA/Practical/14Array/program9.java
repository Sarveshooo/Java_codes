import java.io.*;
class ArrayDemo{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size for array: ");
		int size = Integer.parseInt(br.readLine());

		int[] arr = new int[size];
		for(int i=0; i<size; i++){

			System.out.print("Enter "+ (i+1) +" Element: :");
			arr[i]=Integer.parseInt(br.readLine());
		}

		for(int i=0; i<arr.length; i++){

			if(i%2==1){			
				System.out.println(arr[i]+" is an odd indexed Element.");
			}
		}

	}
}
