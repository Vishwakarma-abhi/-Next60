import java.util.*;

public class SuperiorElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = { 2, 1, 3, 2, 4 };

        int n = 4;

        // brute force

        brute(arr);

    }
    // O(n) -> Time complexity

    public static void optimized(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        Integer n = arr.length;
        int max = arr[n - 1];
        list.add(max);
        // we know the last element is always and further from back side we search for
        // leader comparing it with the found max values
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                list.add(max);
                max = arr[i];
            }
        }
        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list);
    }

    // O(n^2)
    public static void brute(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    isLeader = false;
                    break;

                }
            }
            if (isLeader) {
                list.add(arr[i]);
            }
        }

        System.out.println(list);
    }
}
