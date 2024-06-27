import java.util.*;

class ArrayDemo3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.print("Enter the Elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the key number: ");
        int key = sc.nextInt();

        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                cnt++;
            }
        }

        if (cnt > 2) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    arr[i] = arr[i] * arr[i] * arr[i];
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
