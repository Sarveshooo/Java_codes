class JVMInternal{

	public static void main(String[] args){

		int x = 9;
		char ch = '9';

		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(ch));
	}
}
