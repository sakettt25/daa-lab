// Given an array arr[] of size N, find the prefix sum of the array. 
//A prefix sum array is another array prefixSum[] of the same size, 
//such that the value of prefixSum[i] is arr[0] + arr[1] + arr[2] . . . arr[i].


import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }
        
        System.out.print("Prefix sum: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        sc.close();
    }
}