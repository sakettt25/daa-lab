//  Write a program to read ‘n’ integers from a disc file that must contain some duplicate values and store them into an array. Perform the following operations on the array.
// a)Find out the total number of duplicate elements.
// Find out the most repeating element in the array.



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter how many numbers: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        try {
            Scanner file = new Scanner(new File("input.txt"));
            for (int i = 0; i < n; i++) {
                arr[i] = file.nextInt();
            }
            file.close();
            
            int duplicates = 0;
            int mostElement = arr[0];
            int maxCount = 1;
            
            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                
                if (count > 1 && i == 0) {
                    duplicates++;
                } else if (count > 1) {
                    boolean found = false;
                    for (int k = 0; k < i; k++) {
                        if (arr[k] == arr[i]) {
                            found = true;
                            break;
                        }
                    }
                    if (!found) duplicates++;
                }
                
                if (count > maxCount) {
                    maxCount = count;
                    mostElement = arr[i];
                }
            }
            
            System.out.println("Total duplicate values = " + duplicates);
            System.out.println("Most repeating element = " + mostElement);
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        
        sc.close();
    }
}