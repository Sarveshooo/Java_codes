import java.io.*;

class ArrayDemo8{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size for array: ");
		int size = Integer.parseInt(br.readLine());

		char arr[] = new char[size];
		System.out.print("Enter the Element: ");
		for(int i=0;i<arr.length; i++){

			arr[i] = (char)br.read();
			br.skip(1);
		}
		System.out.print("Enter the charater that to be search: ");
		char search = (char)br.read();
		br.skip(1);
		int cnt=0;
		for(int i=0; i<arr.length; i++){

			if(arr[i]==search){
			
				cnt++;
			}
		}
		System.out.println(search+" occur in array "+cnt+" times.");

	}
}
