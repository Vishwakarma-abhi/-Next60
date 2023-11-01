
import java.util.*;

public class find_Min_RotatedSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 12, 15, 18, 1, 2, 5 };

        // We have to find minimum in rotated sorted array

        // What we can observe that the minimum element is always less then its previous
        // element

        int start = 0, end = arr.length - 1;
        int min = Integer.MAX_VALUE;

        // agar ek part sorted nhi rehega toh iska matlab hai ki minimum element waha ho
        // nhi skta
        // it must be in the half part
        while (start <= end) {
            int mid = (start + end) / 2;

            // condition in which array is not rotated condition
            if (arr[start] <= arr[end]) {
                min = Math.min(min, arr[start]);
                break;
            }
            // condition for checking if the left half is sorted or not
            if (arr[start] <= arr[mid]) {
                // it means left half is sorted
                min = Math.min(min, arr[start]);
                // eleminate left part
                start = mid + 1;
            } else {
                // if the right part is sorted
                // then set the minium
                min = Math.min(min, arr[mid]);
                end = mid - 1;

            }

        }
        System.out.println("Minimum element in the array is -> " + min);

    }
}
