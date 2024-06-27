class Student{

	public static void main(String[] args){
		
		float marks = 90.52f;

		if(marks>=35.00){
			if(marks >= 90.00){
				
				System.out.println("Passed: first class with distinction.");
			}else if(marks<90.00 && marks>=80.00){
	
				System.out.println("passed: first class");
			}else if(marks<80.00 && marks>=70.00){
	
				System.out.println("passed: Second class");
			}else if(marks<70.00 && marks>=60.00){
	
				System.out.println("passed: Third class");
			}else{
	
				System.out.println("pass");
			}		
		}else{
			
			System.out.println("You fail");
		}	
	}	
}




	

