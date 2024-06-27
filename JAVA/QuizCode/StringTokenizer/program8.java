import java.util.*;

class Demo {

	public static void main(String[] args){

		String str = "1 2 3";

		StringTokenizer strtoken = new StringTokenizer(str," ");

		while(strtoken.hasMoreTokens()){

			int x = strtoken.nextToken(); 
			System.out.println();

		}

	}

}
