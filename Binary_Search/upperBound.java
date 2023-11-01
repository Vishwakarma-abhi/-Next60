import java.util.*;

public class upperBound {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 4, 7, 8, 10 };

        System.out.println("Enter elment for finding lower search");
        int x = sc.nextInt();

        int start = 0;
        int end = arr.length - 1;
        int ans = 0;
        while (start <= end) {

            int mid = (start + (end - start)) / 2;

            if (arr[mid] < x) {
                ans = mid;
                start = mid + 1;

            } else {
                end = mid - 1;

            }
        }

        System.out.println("Upper bound -> " + ans);
    }
}
