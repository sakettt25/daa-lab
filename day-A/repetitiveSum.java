

import java.util.Scanner;

public class repetitiveSum {

    public static int sum(int num) {
        int sum = 0;

        while (num > 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        while (num > 9) {
            num = sum(num);
        }

        System.out.println("Sum = " + num);

        sc.close();
    }
}
