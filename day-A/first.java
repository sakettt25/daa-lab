// Write a program to find out the second smallest and second largest element stored in an array of n integers. 
// Input: Size of the array is ‘n’ and read ‘n’ number of elements from a disc file.
// Output: Second smallest, Second largest






import java.io.File;
import java.io.FileNotFoundException;
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

            int smallest = Integer.MAX_VALUE;
            int secondSmallest = Integer.MAX_VALUE;
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int num : arr) {
                if (num < smallest) {
                    secondSmallest = smallest;
                    smallest = num;
                } else if (num < secondSmallest && num != smallest) {
                    secondSmallest = num;
                }

                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                } else if (num > secondLargest && num != largest) {
                    secondLargest = num;
                }
            }

            if (secondSmallest == Integer.MAX_VALUE) {
                System.out.println("There is no second smallest number.");
            } else {
                System.out.println("The second smallest number is: " + secondSmallest);
            }

            if (secondLargest == Integer.MIN_VALUE) {
                System.out.println("There is no second largest number.");
            } else {
                System.out.println("The second largest number is: " + secondLargest);
            }

        } catch (FileNotFoundException e) {
            System.out.println("I could not find the file 'input.txt'. Please make sure it exists.");
            e.printStackTrace();
        }
    }
}