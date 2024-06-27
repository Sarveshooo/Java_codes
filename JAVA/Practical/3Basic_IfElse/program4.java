class Aphabate{

	public static void main(String[] args){
		
		char ch = 'b';

		if(ch >= 'a' && ch <= 'z'){
			
			System.out.println(ch +" is a Lower case.");
		}else if(ch >= 'A' && ch <= 'Z'){

			System.out.println(ch +" is Upper case");
		}else{
			
			System.out.println(ch +" is Symbol.");
		}
			
	}
}
