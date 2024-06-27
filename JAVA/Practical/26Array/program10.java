import java.io.*;

class ArrayDemo10{

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
		System.out.print("Enter Element: ");
		char ch = (char)br.read();
		br.skip(1);
		System.out.print("Elements are: \t");
		for(int i=0; i<arr.length; i++){

			if(arr[i]==ch){
			
				break;
			}else{

				System.out.println(arr[i]+"\t");
			}
		}

	}
}
