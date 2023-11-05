import java.util.*;

class duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 2, 3, 4, 5, 6, 6 };

        int answer = 0;
        int n = arr.length;

        // XOR all the elements with 0
        for (int i = 0; i < n; i++) {
            answer = answer ^ arr[i];
        }

        // XOR all the elements with no from 1 to n
        // i.e answer^0 = answer
        for (int i = 1; i < n; i++) {
            answer = answer ^ i;
        }

        System.out.println(answer);

    }
}
