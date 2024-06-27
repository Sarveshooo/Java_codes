class IfElseDemo{

	public static void main(String[] args){
		
		int n = -10;
		 
		if(n % 2 == 0 && n > 10){
			
			System.out.println(n + " is even and greater than 10.");	
		}else if(n % 2 == 0 && 	n < 10){
			
			System.out.println(n + " is even and less than 10.");	
			
		}else if(n % 2 != 0 && n > 10){
		
			System.out.println(n +" is odd and greater than 10.");	
		}else if(n % 2 != 0 && n < 10){
		
			System.out.println(n +" is odd and less than 10.");
		}else{
			
			System.out.println("number is given as a hardcoded value");
		}	

	}
}
