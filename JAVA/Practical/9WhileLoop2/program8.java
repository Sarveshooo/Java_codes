class WhileDemo{

	public static void main(String[] args){
	
		int num = 256985;
		int podd =1;
		while(num!=0){

			int rem = num %10;

			if (rem%2!=0){

				podd *= rem;
			}
			num /=10;
		}
		System.out.print(podd);
	}
}
