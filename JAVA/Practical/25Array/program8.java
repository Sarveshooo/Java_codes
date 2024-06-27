import java.util.*;

class ArrayDemo8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.print("Enter the Element :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Composite numbers in the array are: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 1) {
                continue;
            }
            int j = 2;
            for (; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    System.out.print(arr[i] + "\t");
                    break;
                }
            }
            if (j < arr[i] && arr[i] != 1) {
                continue;
            }
        }
    }
}
