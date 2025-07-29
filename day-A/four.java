//  Write a function to ROTATE_RIGHT (p1, p2) right an array for first p2 elements by 1 position using EXCHANGE (p, q) function that swaps/exchanges the numbers p & q.
// Parameter p1 be the starting address of the array and p2 be the number of elements to be rotated.  

import java.util.Scanner;

public class four {

    public static void EXCHANGE(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void ROTATE_RIGHT(int[] p1, int p2) {
        for (int i = p2 - 1; i > 0; i--) {
            EXCHANGE(p1, i, i - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array N: ");
        int n = sc.nextInt();
        int[] A = new int[n];

        System.out.println("Enter an array A of size " + n + ":");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.print("Call the function ROTATE_RIGHT (A, p2), enter p2: ");
        int p2 = sc.nextInt();

        if (p2 > n || p2 <= 1) {
            System.out.println("Invalid input for p2. It must be greater than 1 and less than or equal to N.");
            sc.close();
            return;
        }

        System.out.print("Before ROTATE: \t");
        for (int num : A) {
            System.out.print(num + " ");
        }
        System.out.println();

        ROTATE_RIGHT(A, p2);

        System.out.print("After   ROTATE: \t");
        for (int num : A) {
            System.out.print(num + " ");
        }
        System.out.println();

        sc.close();
    }
}
