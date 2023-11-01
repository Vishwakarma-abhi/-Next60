import java.util.Scanner;

public class searchInsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {};

        System.out.println("Enter value of m");
        int m = sc.nextInt();

        int ans = solve(arr, m);
        System.out.println("Insert Position is -> " + ans);
    }

    static int solve(int[] arr, int m) {
        int n = arr.length;
        int ans = n;
        int start = 0;
        int end = n - 1;

        while (start <= end) {

            int mid = (int) ((start + end) / 2);

            if (arr[mid] >= m) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;

    }
}
