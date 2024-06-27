class TestDemo{

	static void main(){

		System.out.println("Inside void main");

	}
	public static void main(String[] args){

		System.out.println("Inside orignal main");
		main();
	}
}
