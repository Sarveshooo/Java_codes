class WhileDemo{

	public static void main(String[] args){

		int i = 1;

		while(i<=6){

			if(i%2==0){

				System.out.print(i+" ");
			}else{

				System.out.print((char)(64+i)+" ");
			}
			i++;
		}
	}
}
