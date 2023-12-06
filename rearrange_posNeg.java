import java.util.*;

public class rearrange_posNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 9, 4, -2, -1, 5, 0, -5, -3, 2 };

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                pos.add(arr[i]);
            else
                neg.add(arr[i]);
        }
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = pos.get(k);
                k++;
            }
        }
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = pos.get(n);
                n++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
