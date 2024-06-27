import java.util.*;

class ArrayDemo6 {

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

        int flag = 0;  

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%key == 0) {
                System.out.println(key + " found at index " + i);
                flag = 1;
            }
        }

        if (flag == 0) {
            System.out.println("No such element found");
        }
    }
}
