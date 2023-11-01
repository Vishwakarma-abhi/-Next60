import java.util.*;

class bSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

        System.out.println("Enter elment to be searched");
        int el = sc.nextInt();

        // iterative Approach
        boolean isPresent = false;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] == el) {
                isPresent = true;
                break;
            }

            if (arr[mid] > el) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if (isPresent) {
            System.out.println(el + " found");
        } else {
            System.out.println(el + " Not Found ");
        }

        sc.close();

    }
}