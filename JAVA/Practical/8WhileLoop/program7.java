class WhileDemo{

	public static void main(String[] args){

		int num = 93079224;
		int cnt=0;
		while(num>0){
			
			cnt++;
			num /= 10;
		}
		System.out.println(cnt);
	}
}
