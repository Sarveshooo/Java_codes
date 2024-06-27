class Real{

	public static void main(String[] args){

		int num = 1;
		int capacity = 30;
		while(true){
			
			if(num==capacity){
				
				System.out.println("there is no space in castle");
				break;

			}
			System.out.println(num+" you are allow into the castle");
			num++;
		}

		for(; capacity>=1; capacity--){

			System.out.println(capacity+" people are left from castle");
		}

	}
}
