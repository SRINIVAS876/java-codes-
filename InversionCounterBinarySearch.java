import java.util.*;

public class InversionCounter {

    public static long countInversions(int[] arr) {
        int[] temp = new int[arr.length];
        return mergeSortAndCount(arr, temp, 0, arr.length - 1);
    }

    private static long mergeSortAndCount(int[] arr, int[] temp, int left, int right) {
        long invCount = 0;
        if (left < right) {
            int mid = (left + right) / 2;

            // Count in left half
            invCount += mergeSortAndCount(arr, temp, left, mid);

            // Count in right half
            invCount += mergeSortAndCount(arr, temp, mid + 1, right);

            // Count during merge
            invCount += mergeAndCount(arr, temp, left, mid, right);
        }
        return invCount;
    }

    private static long mergeAndCount(int[] arr, int[] temp, int left, int mid, int right) {
        long invCount = 0;
        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += (mid - i + 1); // count inversions
            }
        }

        // Copy remaining elements
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        // Copy merged portion back
        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return invCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Count and print number of inversions
        long result = countInversions(arr);
        System.out.println(result);
    }
}
