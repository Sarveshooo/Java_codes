import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 2; j <= columns * 2; j += 2) {
                if (i % 2 == 0) {
                    System.out.print((columns * 2 + 2) - j);
                } else {
                    System.out.print(j);
                }
                System.out.print(" ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
