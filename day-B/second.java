import java.io.*;
import java.util.Scanner;

public class second {

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public static void main(String[] str) {
        if (str.length != 2) {
            System.out.println("recheck crowww");
            return;
        }

        String inputFilePath = str[0];
        String outputFilePath = str[1];

        try (Scanner inputFileScanner = new Scanner(new File(inputFilePath));
             FileWriter outputFileWriter = new FileWriter(outputFilePath)) {

            while (inputFileScanner.hasNextInt()) {
                int num1 = inputFileScanner.nextInt();
                if (!inputFileScanner.hasNextInt()) {
                    System.out.println("Warning: Odd number of integers in input file.");
                    break;
                }
                int num2 = inputFileScanner.nextInt();
                int resultGCD = findGCD(num1, num2);
                outputFileWriter.write("The GCD of " + num1 + " and " + num2 + " is " + resultGCD + "\n");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + e.getMessage());
            return;
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            return;
        }

        try (Scanner outputFileScanner = new Scanner(new File(outputFilePath))) {
            while (outputFileScanner.hasNextLine()) {
                System.out.println(outputFileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Output file not found after writing - " + e.getMessage());
        }
    }
}

