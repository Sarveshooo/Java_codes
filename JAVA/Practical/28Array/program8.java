import java.util.*;

class ArrayDemo8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        char arr[] = new char[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next().charAt(0);
        }

        System.out.println("Alternate element before reverse:");
        for (int i = 0; i < arr.length; i += 2) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length / 2; i++) {
            char tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }

        System.out.println("Alternate element after reverse:");
        for (int i = 0; i < arr.length; i += 2) {
            System.out.println(arr[i]);
        }
    }
}
