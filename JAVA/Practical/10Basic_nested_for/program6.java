class NestedDemo{

	public static void main(String[] args){
		
		int n = 1;
		for(int i = 1; i<=3; i++){

			for(int j = 1;j<=3; j++){

				System.out.print(n +""+ (char)(64+i)+" "); 
			}
			n++;
			System.out.println();
		}
	}
}


