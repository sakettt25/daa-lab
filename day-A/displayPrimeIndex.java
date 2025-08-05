import java.util.Scanner;

public class displayPrimeIndex {

    public static boolean prime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void display(int[] arr) {
        boolean foundPrime = false;
        System.out.print("Indexes of prime numbers: ");

        for (int i = 0; i < arr.length; i++) {
            if (prime(arr[i])) {
                System.out.print(i + " ");
                foundPrime = true;
            }
        }

        if (!foundPrime) {
            System.out.print("No prime numbers found.");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        display(arr);
        sc.close();
    }
}