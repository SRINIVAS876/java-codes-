import java.util.Scanner;

public class GreatestOfFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int greatest = a;

        if (b > greatest) {
            greatest = b;
        }
        if (c > greatest) {
            greatest = c;
        }
        if (d > greatest) {
            greatest = d;
        }

        System.out.println(greatest);
    }
}
