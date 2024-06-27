class WhileDemo{

	public static void main(String[] args){
	
		int num = 2569185;

		System.out.print("Digits not divisible by 3 are:");

		while(num!=0){

			int rem = num %10;

			if (rem%3!=0){

				System.out.print(rem+" ");
			}
			num /=10;
		}
	}
}
