import java.util.*;

class ArrayDemo6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.print("Enter the Element :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 1) {
                continue;
            }
            int j = 2;
            for (; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    break;
                }
            }
            if (j == arr[i]) {
                System.out.println("First prime number found at index "+i);
		break;
            }
        }
    }
}

