import java.util.Scanner;

public class fib {
    public static int fibo(int n) {

        if (n <= 1) {
            return n;
        }
        
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {

            System.out.print(fibo(i) + " ");

        }
    }
}
