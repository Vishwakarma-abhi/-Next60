import java.util.*;

public class lowerBound {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 2, 2, 3, 3, 5 };

        System.out.println("Enter elment for finding lower search");
        int x = sc.nextInt();

        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length;
        while (start <= end) {

            int mid = (start + (end - start)) / 2;

            if (arr[mid] >= x) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println("Lower bound -> " + ans);
    }
}
