import java.util.Scanner;

public class sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value ");
        int n = sc.nextInt();
        int ans = solve(n);
        System.out.println("Answer is -> " + ans);
    }

    private static int solve(int n) {
        int low = 1;
        int high = n;

        while (low <= high) {

            int mid = (low + high) / 2;

            int val = mid * mid;

            if (val <= n) {
                // move towards the right half for finding the maximum value
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }
}
