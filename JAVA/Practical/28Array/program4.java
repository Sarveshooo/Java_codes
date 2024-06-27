import java.util.*;

class ArrayDemo4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        int arr1[] = new int[size];

        System.out.println("Enter the elements for the first array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the elements for the second array:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Common elements:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i] == arr1[j]) {
                    System.out.println(arr[i]);
                    break;  
                }
            }
        }
    }
}
