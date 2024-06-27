class Profit{

	public static void main(String[] args){
		
		int s_prize = 200;
		int c_prize =1200;

		if(s_prize > c_prize){
			
			int profit = s_prize-c_prize;
			System.out.println(profit +" rs profit.");
		}else if(s_prize < c_prize){
			
			int profit = s_prize-c_prize;
			System.out.println(profit +" rs loss.");
		}else{
			
			System.out.println("no profit no loss.");
		}
	}
}
