import java.io.*;


class Pattern10{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter rows: ");

		int rows = Integer.parseInt(br.readLine());
		int num =rows;
		for(int i = rows; i>=1; i--){
			
			for(int j=i; j>=1; j--){
				
				if(i%2==0){	
					System.out.print((char)(64+ j) +" ");
				
				}else{
					System.out.print((char)(96+ j) +" ");
				}
			}
			System.out.println();
		}
	}
}

