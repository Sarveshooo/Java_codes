class WhileDemo{

	public static void main(String[] args){

		int num = 9307;

		while(num>0){

			int rem = num % 10;
			System.out.println(rem);

			num /= 10;
		}
	}
}