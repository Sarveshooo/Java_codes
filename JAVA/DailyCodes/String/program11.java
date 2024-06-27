class JVMInternal{

	public static void main(String[] args){

		String str1 = "Abhi";
		String str3 = "Abhi";
		String str2 = new String("Abhi");
		String str4 = new String("Abhi");
	
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str4));
	}
}
