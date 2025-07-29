//  Write a program to read ‘n’ integers from a disc file that must contain some duplicate values and store them into an array.
// Perform the following operations on the array.
// a)Find out the total number of duplicate elements.
// b)Find out the most repeating element in the array.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class third {

    public static void main(String[] args) {
        Scanner consoleScanner = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to read from file: ");
        int n = consoleScanner.nextInt();

        int[] arr = new int[n];

        try {
            File file = new File("c:/Users/KIIT0001/Desktop/daa-lab/day-A/input.txt");
            Scanner fileScanner = new Scanner(file);

            System.out.print("The content of the array: ");
            for (int i = 0; i < n; i++) {
                if (fileScanner.hasNextInt()) {
                    arr[i] = fileScanner.nextInt();
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println(); 

            fileScanner.close();

            findDuplicatesAndMostRepeating(arr);

        } catch (FileNotFoundException e) {
            System.out.println("Error: input.txt not found! Please make sure the file is in the correct directory.");
        }
        consoleScanner.close();
    }

    public static void findDuplicatesAndMostRepeating(int[] arr) {

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {

            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int totalDuplicates = 0;
        int mostRepeatingElement = -1;
        int maxFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int number = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > 1) {
                totalDuplicates++;
            }


            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostRepeatingElement = number;
            }
        }

        System.out.println("Total number of duplicate values = " + totalDuplicates);
        System.out.println("The most repeating element in the array = " + mostRepeatingElement);
    }
}