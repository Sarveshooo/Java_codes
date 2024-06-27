import java.io.*;

class Pattern10{

	public static void main(String[] args)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the no of Rows :");
		int rows = Integer.parseInt(br.readLine());

		for(int i = 1; i<= rows; i++){

			int num = i;
			for(int j=1; j<=rows-i+1; j++){

				if(i%2==0){
					if(j%2==0){
					
						System.out.print(64+num++ +" ");
					}else{

						System.out.print((char)(64+num++)+" ");
					}
				}else{
					if(j%2==0){

						System.out.print((char)(64+num++)+" ");
					}else{

						System.out.print(64+num++ +" ");
					}
				}
			}
			System.out.println();		
		}
	}
	
}

