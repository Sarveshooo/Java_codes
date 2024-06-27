class WhileDemo{

	public static void main(String[] args){

		int num = 9367924;
		int producteven = 1;
		int sumodd = 0;

		while(num>0){

			int rem = num % 10;

			if(rem % 2 ==0){

				producteven *= rem;
			}else{

				sumodd += rem;
			}
			num /=10;
		}
		System.out.println("Product of even :"+producteven);
		System.out.println("Sum  of odd :"+sumodd);
	}
}
