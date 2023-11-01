import java.util.Scanner;

public class first_last_Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 2, 3, 4, 4, 4, 5, 6 };

        System.out.println("Enter the number");

        int x = sc.nextInt();

        // Step 1 - find the first occurence in the left side
        // Step 2 - find the last occurence in the right side

        int fOccur = first(arr, x);
        int lOccur = second(arr, x);

        System.out.println("First Occurence of " + x + " at index " + fOccur);
        System.out.println("Last Occurence of " + x + " at index " + lOccur);

    }

    protected static int second(int[] arr, int x) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] == x) {
                ans = mid;
                start = mid + 1;
            }
            if (arr[mid] > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;

    }

    protected static int first(int[] arr, int x) {

        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] == x) {
                ans = mid;
                end = mid - 1;
            }
            if (arr[mid] > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
