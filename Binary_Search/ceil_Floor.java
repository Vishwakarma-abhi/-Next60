import java.util.Scanner;

public class ceil_Floor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 3, 4, 7, 8, 8, 10 };

        int x = 5;
        int n = 6;

        int floor = lb(arr, x, n);
        int ceil = up(arr, x, n);

        System.out.println("floor value " + arr[floor]);
        System.out.println("Ceil Value " + arr[ceil]);
        sc.close();
    }

    private static int up(int[] arr, int x, int n) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] >= x) {
                ans = mid;
                end = mid - 1;
            } else {

                start = mid + 1;
            }
        }

        return ans;
    }

    private static int lb(int[] arr, int x, int n) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] <= x) {
                ans = mid;
                start = mid + 1;
            } else {

                end = mid - 1;
            }
        }
        return ans;
    }

}
