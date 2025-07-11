import java.util.*;

class FrequentSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "ababab";
        int k = sc.nextInt();  // Read the value of k

        Map<String, Integer> freq = new HashMap<>();
        int maxFreq = 0;
        String mostSub = "";

        for (int i = 0; i <= s1.length() - k; i++) {
            String sub = s1.substring(i, i + k);
            freq.put(sub, freq.getOrDefault(sub, 0) + 1);

            if (freq.get(sub) > maxFreq) {
                maxFreq = freq.get(sub);
                mostSub = sub;
            }
        }

        System.out.println("Most frequent substring of length " + k + ": " + mostSub);
        System.out.println("Frequency: " + maxFreq);
    }
}
