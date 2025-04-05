import java.util.Scanner;

public class ArrayFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        
        // Taking values of integers
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt(); // Elements of array
        }

        // Step 1: Find unique elements
        int newarray[] = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j <= i; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count == 1) {
                newarray[k] = array[i];
                k++;
            }
        }

        // Step 2: Calculate frequency of each unique element
        for (int i = 0; i < k; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (newarray[i] == array[j]) {
                    count++;
                }
            }
            System.out.printf("%d occurs %d times\n", newarray[i], count);
        }
    }
}
