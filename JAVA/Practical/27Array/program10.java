import java.util.*;

class ArrayDemo10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.print("Enter the Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int fact = 1;
            while (arr[i] != 0) {
                fact *= arr[i];
                arr[i]--;
            }
            System.out.print(fact + "\t");
        }
    }
}
