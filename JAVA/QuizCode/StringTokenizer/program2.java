import java.util.*;

class Demo {

	public static void main(String[] args){

		String str ="Core2web";

		StringTokenizer strtoken = new StringTokenizer(str,"");

		while(strtoken.hasMoreTokens()){

			System.out.println(strtoken.nextToken()+",");
		}

	}

}
