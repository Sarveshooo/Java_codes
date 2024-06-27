import java.util.*;

class ArrayDemo5 {

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

            int num = arr[i];
            int cnt = 0;

            while (num != 0) {
                num /= 10;
                cnt++;
            }

            System.out.println(cnt);
        }

    }
}
