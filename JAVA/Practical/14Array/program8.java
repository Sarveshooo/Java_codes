import java.io.*;
class EmployeeAge{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the count of Employee: ");
		int emp = Integer.parseInt(br.readLine());

		int[] arr = new int[emp];
		for(int i=0; i<emp; i++){

			System.out.print("Enter age for "+ (i+1) +" Employee: ");
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		for(int i=0; i<arr.length; i++){

			System.out.println((i+1)+" employee age: "+arr[i]);
		
		}

	}
}
