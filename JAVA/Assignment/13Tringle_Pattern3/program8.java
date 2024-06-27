import java.io.*;


class Pattern8{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter rows: ");

		int rows = Integer.parseInt(br.readLine());
		int num =rows;
		for(int i = 1; i<=rows; i++){
			
			for(int j=num; j>=1; j--){
				
				if(i%2==0){	
					System.out.print((char)(64+ j) +" ");
				
				}else{
					System.out.print(j +" ");
				}
			}
			System.out.println();
			num--;
		}
	}
}
