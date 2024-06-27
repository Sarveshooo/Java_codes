// Bank Balance
class RealTimeExample{
	
	public static void main(String[] args){
	
		double balance = 0;
		
		if(balance>0){

			System.out.println(balance +" RS in your account you can able to make payment");
		}else if(balance<0){
		
			System.out.println(balance +" RS in your account you unable to make payment");
			System.out.println("You need to deposit "+(-balance)+" RS first for payment");
		}else{
	
			System.out.println("You have "+balance+" RS in your account.");
		}

	}
}
