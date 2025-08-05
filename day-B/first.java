import java.io.*;
import java.util.Scanner;

public class first {

    public static String dTB(int n) {

        if (n == 0) {
            return "0";
        } 
        else if (n == 1) {
            return "1";
        } 
        else {
            return dTB(n / 2) + (n % 2);
        }
    }

    public static String formatB(int num) {
    String bin = dTB(num);
    while (bin.length() < 16) {
        bin = "0" + bin;
    }
    return bin;
}

    public static void main(String[] str) {
        if (str.length != 3) {
            System.out.println("rechek croww");
            return;
        }

        int n = Integer.parseInt(str[0]);
        String inputFile = str[1];
        String outputFile = str[2];

        try {
            Scanner input = new Scanner(new File(inputFile));
            FileWriter writer = new FileWriter(outputFile);

            for (int i = 0; i < n && input.hasNextInt(); i++) {
                int num = input.nextInt();
                String bin = formatB(num);
                writer.write("The binary equivalent of " + num + " is " + bin + "\n");
            }

            input.close();
            writer.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        try {
            Scanner output = new Scanner(new File(outputFile));
            while (output.hasNextLine()) {
                System.out.println(output.nextLine());
            }
            output.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}










//formatBinary-> formatB