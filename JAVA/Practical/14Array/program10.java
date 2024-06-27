import java.io.*;
class RealTime{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("How many movie do you watch?: ");
		int size = Integer.parseInt(br.readLine());

		float arr[] = new float[size];
		for(int i=0; i<size; i++){

			System.out.print("Enter IMDB rating of "+ (i+1) +" Movie :");
			arr[i]=Float.parseFloat(br.readLine());
		}
	
		for(int i=0; i<arr.length; i++){

			System.out.println("IMDB rating for "+(i+1)+ " movie is "+arr[i]);
		}

	}
}
