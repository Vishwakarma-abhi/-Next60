import java.util.Scanner;

public class peak {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 5, 1 };

        int peak = solve(arr, arr.length);
        System.out.println("Peak element of the array is -> " + arr[peak] + " at index -> " + peak);
    }

    private static int solve(int[] arr, int n) {
        if (n == 1)
            return 0;

        if (arr[0] > arr[1])
            return 0;

        if (arr[n - 1] > arr[n - 2])
            return n - 1;

        int low = 1;
        int high = n - 2;

        while (low < high) {

            int mid = (low + high) / 2;

            // condition for peak element
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            if (arr[mid] > arr[mid - 1]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return -1;
    }
}
