// Given an array arr[] of size N, find the prefix sum of the array. 
//A prefix sum array is another array prefixSum[] of the same size, 
//such that the value of prefixSum[i] is arr[0] + arr[1] + arr[2] . . . arr[i].


import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] prefixSum = new int[n];

        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        System.out.print("Input Array:  ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "   ");
        }
        System.out.println();

        System.out.print("Output Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(prefixSum[i] + "   ");
        }
        System.out.println();

        sc.close();
    }
}
