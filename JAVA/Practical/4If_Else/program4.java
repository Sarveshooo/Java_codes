class Percentage{
	
	public static void main(String[] args){
	
		float p = 75.1f;

		if(p > 85.00){
		
			System.out.println("You can choose your career in Medical department");
		}else if(p <= 85.00 && p>=75.00){
		
			System.out.println("You can choose your career in Enginnering department");
		}else if(p <= 75.00 && p >= 65.00){
		
			System.out.println("You can choose your career in Pharmacy or BSC");
		}else{
		
			System.out.println("You can start your bussiness");
		}
	}
}
