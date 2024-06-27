class SwitchDemo{

	public static void main(String[] args){

		char grade = 'O';

		switch(grade){

			case 'O':
				System.out.println("Outstanding!");
				break;
			
			case 'A':
				System.out.println("Excellent!");
				break;
			
			case 'B':
				System.out.println("Average!");
				break;
			
			case 'C':
				System.out.println("Poor!");
				break;

			default:
				System.out.println("You are only pass ");
			
		}
	}
}
