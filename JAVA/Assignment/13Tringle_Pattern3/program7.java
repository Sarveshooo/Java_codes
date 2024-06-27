import java.io.*;


class Pattern7{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter rows: ");

		int rows = Integer.parseInt(br.readLine());

		for(int i = rows; i>=1; i--){
			int num = i;
			for(int j=1; j<=i; j++){
				
				if(i%2==0){
					if(j%2==0){
						System.out.print((char)(96+ num--) +" ");
					}else{
					
						System.out.print(num-- +" ");
					}
				}else{
					if(j%2==0){
						System.out.print((char)(96+ num--) +" ");
					}else{
					
						System.out.print(num-- +" ");
					}

				}
			}
			System.out.println();
		}
	}
}
