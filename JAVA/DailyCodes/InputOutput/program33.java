import java.io.*;

class InputDemo {
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);

		int x = isr.read();
		System.out.println(x);
		
	}
}

