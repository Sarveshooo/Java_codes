import java.io.*;

class InputDemo{

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name :");
		String name = br.readLine();
		System.out.println("Enter Society name :");
		String scName = br.readLine();
		System.out.println("Enter wing :");
		char wing = (char)br.read();
		br.skip(1);
		System.out.println("Enter flat no :");
		int flatNo = Integer.parseInt(br.readLine());

		System.out.println("Name :"+name);
		System.out.println("society Name :"+scName);
		System.out.println("Wing :"+wing);
		System.out.println("flat no :"+flatNo);

	}
}




