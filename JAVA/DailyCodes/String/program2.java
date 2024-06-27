class JVMInternal{

	public static void main(String[] args){

		char ch1 = 'A';
		char ch2 = 'a';
		char ch3 = 'B';

		int x = 65;
		int y = 97;
		int z = 66;
	
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
		System.out.println(System.identityHashCode(z));
		System.out.println(System.identityHashCode(ch1));
		System.out.println(System.identityHashCode(ch2));
		System.out.println(System.identityHashCode(ch3));
	}
}
