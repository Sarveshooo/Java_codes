class WhileDemo{

	public static void main(String[] args){

		int num = 214367689;
		int cntodd = 0;
		int cnteven =0;

		while(num>0){

			int rem = num % 10;
			if(rem %2==0){

				cnteven++;
			}else{
			
				cntodd++;
			}
			num /= 10;
		}
		System.out.println("Odd Count:"+cntodd);
		System.out.println("Even Count:"+cnteven);
	}
}
