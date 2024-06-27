import java.util.*;

class ArrayDemo6{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size for array: ");
		int size = sc.nextInt();

		char arr[] = new char[size];
		System.out.print("Enter the Element: ");
		for(int i=0;i<arr.length; i++){

			arr[i] = sc.next().charAt(0);
		}
		int cntVowel = 0;
		int cntConsonent = 0;
		for(int i=0; i<arr.length; i++){

			if(arr[i]=='a'|| arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]== 'u'|| arr[i]=='A'|| arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]== 'U'){
				
				cntVowel++;
			}
			else{
				cntConsonent++;
			}
		}
		System.out.println("Count of Voewls is "+cntVowel);
		System.out.println("Count of Consonent is "+cntConsonent);

	}
}
