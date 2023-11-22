
import java.util.Scanner;

public class decompress_RunLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int nums[] = new int[size];

        System.out.println("Enter the elements in the array");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        int ans[] = new int[size * 2]; // The size of the ans array should be doubled

        // Now we will perform the logic for the solution
        for (int i = 0; i < nums.length; i = i + 2) {
            System.out.println("Frequency -> " + nums[i] + " value -> " + nums[i + 1]);
        }

        int k = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            k = fillAns(ans, nums[i], nums[i + 1], k);
        }
        System.out.println("Decompressed Array");
        // Print the decompressed array
        for (int i = 0; i < k; i++) {
            System.out.print(ans[i] + " ");
        }

        sc.close();
    }

    private static int fillAns(int[] ans, int freq, int value, int i) {
        // System.out.println("freq is -> " + freq);
        // System.out.println("Value is -> " + value);
        while (freq > 0) {
            ans[i] = value;
            // System.out.println(i);
            i++;
            freq--;
        }
        // System.out.println(i);
        return i;
    }
}
