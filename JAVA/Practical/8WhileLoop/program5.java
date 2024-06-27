class PatternDemo{

	public static void main(String[] args){

		int i = 1;
		int num = 1;
		if(num%2==1){
			while(i<=4){
			
				int j= 1;
				while(j<=4){

					System.out.print(num+" ");
					num+=2;
					j++;
				}
				System.out.println();
				i++;
			}
		}else{

			System.out.println("Please enter odd number.");
		}
	}
}
