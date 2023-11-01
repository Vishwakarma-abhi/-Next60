import java.util.Scanner;

public class search_Rotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 12, 15, 18, 2, 4 };

        System.out.println("Enter the number");
        int x = sc.nextInt();

        int ans = finder(arr, x);

        if (ans != -1) {
            System.out.println(x + "  is found at index " + ans);
        } else {
            System.out.println("Not found in the array");
        }

    }

    private static int finder(int[] arr, int x) {

        /*
         * Steps to find x in rotated sorted array
         * arr - 12 15 18 2 4
         * 0 1 2 3 4
         * k = 2
         * find the pivot point
         * - check range
         * - In this Question remember the concept for range and checking the
         * comparision with x
         * 
         */
        int ans = -1;
        int start = 0, end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] == x) {
                ans = mid;
                break;
            }

            if (arr[start] <= arr[mid]) {
                // then the left part is sorted
                // Now check whether the given value x lies in the range of start and mid or not
                if (arr[start] <= x && x <= arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] <= x && x <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }

        return ans;
    }

}
