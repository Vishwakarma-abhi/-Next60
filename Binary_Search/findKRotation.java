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

            // the minimum element will be in the sorted array left most element
            // so first find the sorted part
            if (arr[start] <= arr[mid]) {
                // left part is sorted
                minIndex = Math.min(minIndex, start);
                end = mid - 1;
            } else {
                minIndex = Math.min(minIndex, mid);
                start = mid + 1;
            }

        }
        System.out.println(minIndex);

    }
}
