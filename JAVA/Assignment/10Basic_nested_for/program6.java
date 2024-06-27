import java.util.*;
class Pattern6{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Rows :");
		int rows = sc.nextInt();
		
		for(int i = 1; i<=rows; i++){
			int n = 1;
			for(int j = 1;j<=rows; j++){

				System.out.print(n +""+ (char)(64+n)+" "); 
				n++;
			}
			System.out.println();
		}
	}
}


