class Numbers{

	public static void main(String[] args){

		int num1 =4;
		int num2 = -5;
		int result;
	
		if(num1>0 && num2>0){

			result = num1 * num2;
			switch (result % 2){

				case 0:
					System.out.println("Number is positive");
					break;
				case 1:
					System.out.println("Number is negative");
			}
		}else{

			System.out.println("Negative number is not allowed.");
		}
	}
}
