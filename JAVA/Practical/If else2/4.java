

class If{
	public static void main(String[] s){
		char ch=97;
		System.out.println(ch);
		if (ch=='a'){
			ch+=3;
			System.out.println(ch--);
		}else{
			System.out.println(ch++);
		}
		System.out.println(ch+=5);
	}
}