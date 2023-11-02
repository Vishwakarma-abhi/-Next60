import java.util.Scanner;

public class Single_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 2, 2, 3, 3, 4, 4, 5, 5 };

        // Appraoch - Binary Search , Bit Manipulation(xor), Linear Frequency Search,
        // hashMap

        int single = solve(arr, arr.length);

        System.out.println("Single element in the array is -> " + single);
    }

    private static int solve(int[] arr, int n) {
        if (n == 1)
            return arr[0];

        if (arr[0] != arr[1])
            return arr[0];

        if (arr[n - 1] != arr[n - 2])
            return arr[n - 2];

        int low = 1;
        int high = n - 1;

        while (low < high) {

            int mid = (low + high) / 2;

            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }

            if ((mid % 2 == 0 && arr[mid] == arr[mid + 1]) || (mid % 2 != 0 && arr[mid] == arr[mid - 1])) {
                // move to right part
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return arr[low];
    }
}
