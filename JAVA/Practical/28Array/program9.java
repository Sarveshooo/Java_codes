import java.util.*;

class ArrayDemo9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];
            int rev = 0;
            int originalNum = num; 

            while (num != 0) {

                int rem = num % 10;
                rev = rev * 10 + rem;
                num = num / 10;
            }

            if (originalNum == rev) {
                cnt++;
            }
        }

        System.out.println(cnt + " number of palindrome numbers present in the array");
    }
}
