import java.util.*;

class Demo {

	public static void main(String[] args){

		String str= "235624582265892";

		StringTokenizer strtoken = new StringTokenizer(str, "2");

		while(strtoken.hasMoreElements()){

			System.out.println(strtoken.nextElement());
		}
	}

}
