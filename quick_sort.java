// package sorting;

public class quick_sort {
    public static void main(String[] args) {
        // given input array
        int arr[] = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };

        // let's do Quick Sorting
        // Time Complexity --> O(n * log n)
        // space complexity --> O(ns);
        int low = 0, high = arr.length;

        // here high is taken arr.length -1
        quicksort(arr, low, high - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    private static void quicksort(int[] arr, int low, int high) {

        if (low < high) {
            int pi = partition_point(arr, low, high);

            quicksort(arr, low, pi - 1);
            quicksort(arr, pi + 1, high);

        }

    }

    private static int partition_point(int[] arr, int low, int high) {

        int pivot = arr[high];

        int j = low - 1;

        // int arr[] = { 12, 11, 13, 5, 6, 7, 5, 3, 9};
        /*
         * 5 11 13 12 6 7 5 3 9
         * 5 6 13 12 11 7 5 3 9
         * 5 6 7 12 11 13 5 3 9
         * 5 6 7 5 11 13 12 3 9
         * 5 6 7 5 3 13 12 11 9
         * 
         * 5 6 7 5 3 9 12 11 13
         * 
         */

        for (int i = low; i <= high - 1; i++) {

            if (arr[i] <= pivot) {
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[j + 1];
        arr[j + 1] = arr[high];
        arr[high] = temp;

        return j + 1;
    }
}
