import java.util.*;

class VowelCheack{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size: ");
		int size = sc.nextInt();

		char arr[] = new char[size];
		System.out.println("Enter Element: ");
		for(int i=0; i<arr.length; i++){

			arr[i]=sc.next().charAt(0);
		}
		for(int i=0; i<arr.length; i++){

			if(arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U'){

				System.out.println("Vowel "+arr[i]+" found at index "+i);	
			}else if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){

				System.out.println("Vowel "+arr[i]+" found at index "+i);	
			}
		}
	}


}
