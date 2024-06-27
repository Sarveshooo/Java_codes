import java.util.*;

class ArrayDemo5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size1 of an array: ");
        int size1 = sc.nextInt();
        System.out.print("Enter the size2 of an array: ");
        int size2 = sc.nextInt();

        int arr[] = new int[size1];
        int arr1[] = new int[size2];

        System.out.println("Enter the elements for the first array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the elements for the second array:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        int sum = size1 + size2;
        int comArr[] = new int[sum];

        for (int i = 0; i < arr.length; i++) {
            comArr[i] = arr[i];
        }

        for (int i = 0; i < arr1.length; i++) {
            comArr[i + arr.length] = arr1[i];
        }

        System.out.println("Merged Array:");
        for (int i = 0; i < comArr.length; i++) {
            System.out.print(comArr[i] + " ");
        }
    }
}
