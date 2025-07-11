import java.util.*;

class AsciiShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for (char c : s1.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                int newpos = (c - 'a' + 19) % 26;
                char newchar = (char) ('a' + newpos);
                sb.append(newchar);
            } else {
                sb.append(c);
            }
        }

        System.out.print(sb.toString());
        sc.close(); // good practice
    }
}
