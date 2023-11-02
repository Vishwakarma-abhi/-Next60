import java.util.*;

public class findKRotation {
    public static void main(String[] args) {

        int arr[] = { 12, 15, 18, 2, 4 };

        int rotation = 0;

        int start = 0;
        int minIndex = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] >= arr[0]) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        minIndex = start;
        System.out.println("Totat rotation  => " + start);

    }
}
