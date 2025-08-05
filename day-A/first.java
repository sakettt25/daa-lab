//Write a program to find out the second smallest and second largest element stored in an array of n integers. 

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner sc = new Scanner(file);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            sc.close();

            if (n < 2) {
                System.out.println("The list of numbers should have at least two numbers.");
                return;
            }

            Arrays.sort(arr);
            
            int secondSmallest = -1;
            for (int i = 1; i < n; i++) {
                if (arr[i] != arr[0]) {
                    secondSmallest = arr[i];
                    break;
                }
            }
            
            // Find second largest (skip duplicates)
            int secondLargest = -1;
            for (int i = n - 2; i >= 0; i--) {
                if (arr[i] != arr[n - 1]) {
                    secondLargest = arr[i];
                    break;
                }
            }

            if (secondSmallest == -1) {
                System.out.println("There is no second smallest number.");
            } else {
                System.out.println("The second smallest number is: " + secondSmallest);
            }

            if (secondLargest == -1) {
                System.out.println("There is no second largest number.");
            } else {
                System.out.println("The second largest number is: " + secondLargest);
            }

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            e.printStackTrace();
        }
    }
}