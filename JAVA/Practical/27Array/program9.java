import java.util.*;

class ArrayDemo9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int tmp = num;
        int cnt = 0;

        while (tmp != 0) {
            tmp = tmp / 10;
            cnt++;
        }

        int[] arr = new int[cnt];
        
        tmp = num;
        for (int i = cnt - 1; i >= 0; i--) {
            int digit = tmp % 10;
            arr[i] = digit + 1;
            tmp = tmp / 10;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        
    }
}
