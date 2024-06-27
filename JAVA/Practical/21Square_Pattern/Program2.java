import java.util.*;

class Pattern2{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();

		int num= rows;
		for(int i=1; i<=rows; i++){

			for(int j=1; j<=rows; j++){
				
				if(num%3==0){

					System.out.print(num*3 +"\t");
					num++;
				}else if(num%5==0){

					System.out.print(num*5 +"\t");
					num++;
				}else{

					System.out.print(num++ +"\t");
				}

			}
			System.out.println();
		}
	}
}
