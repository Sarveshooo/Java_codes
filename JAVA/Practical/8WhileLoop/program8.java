class WhileDemo{

	public static void main(String[] args){

		int num = 216985;

		while(num>0){

			int rem = num % 10;
			if(rem%2==1){
				
				System.out.println(rem);
			}

			num /= 10;
		}
	}
}
