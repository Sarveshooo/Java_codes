import java.io.*;
class ArrayDemo{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size for array: ");
		int size = Integer.parseInt(br.readLine());

		char arr[] = new char[size];
		for(int i=0; i<size; i++){

			System.out.print("Enter "+ (i+1) +" Element: :");
			arr[i]=(char) br.read();
			br.skip(1);
		}

		for(int i=0; i<arr.length; i++){
		
				System.out.println(arr[i]);
		}

	}
}
