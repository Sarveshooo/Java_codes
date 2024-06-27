class Voting{

	public static void main(String[] args){
		
		int age = -9;

		if(age>=0){

			if(age>=18){
				
				System.out.println(age +" is valid age for voting");
			}else{
		
				System.out.println(age +" is not valid age for voting");
			}
		}else{

			System.out.println("Invalid age");
		}
	}
}
