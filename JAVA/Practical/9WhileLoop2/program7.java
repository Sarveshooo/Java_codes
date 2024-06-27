class WhileDemo{

	public static void main(String[] args){
	
		int num = 256985;
		int evensum= 0;
		while(num!=0){

			int rem = num %10;

			if (rem%2==0){

				evensum += rem;
			}
			num /=10;
		}
		System.out.println(evensum);
	}
}
