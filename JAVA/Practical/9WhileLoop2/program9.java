class WhileDemo{

	public static void main(String[] args){
	
		int num = 2469185;
		int sumsquare = 0;
		while(num!=0){

			int rem = num %10;

			if (rem%2!=0){

				sumsquare += rem*rem;
			}
			num /=10;
		}
		System.out.print(sumsquare);
	}
}
