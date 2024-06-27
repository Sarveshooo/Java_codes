class WhileDemo{

	public static void main(String[] args){

		long num = 9307922405l;
		long tmp = num;
		int sum = 0;

		while(num>0){

			long rem = num % 10;
			sum += rem;
			num /= 10;
		}
		System.out.println("The sum of "+tmp+" is "+sum);
	}
}
