class Divisible{

	public static void main(String[] args){

		int x = 50;
		
		while(x<=100){

			if(x%4==0 && x%7==0){
				System.out.println(x);
			}
			x++;
		}
	}
}
