class WhileDemo{

	public static void main(String[] args){
	
		int num = 234;
		int product =1;

		while(num!=0){

			int rem = num %10;
			product *= rem;
			num /=10;
		}
		System.out.println(product);
	}
}
