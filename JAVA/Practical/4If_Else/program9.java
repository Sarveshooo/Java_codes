class Pythagorean{

	public static void main(String[] args){

		int x = 3;
		int y = 7;
		int z = 5;

		int a = x * x;
		//System.out.println(a);
		int b = y * y;
		//System.out.println(b);
		int c = z * z;
		//System.out.println(c);
		if(c == a+b){
	
			System.out.println(x+","+y+","+z+" are pythagorean triplet.");
		}else{
	
			System.out.println(x+","+y+","+z+" are not pythagorean triplet.");
		}
	}
}
