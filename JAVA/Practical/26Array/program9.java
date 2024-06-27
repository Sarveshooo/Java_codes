import java.io.*;

class ArrayDemo9{

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
		System.out.print("Elements are: ");
		for(int i=0; i<arr.length; i++){

			if(arr[i]>=97 && arr[i]<=122){
			
				System.out.println(arr[i]+"\t");
				continue;
			}else{

				arr[i]='#';
			}
			System.out.println(arr[i]+"\t");
		}

	}
}
