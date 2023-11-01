import java.util.*;

public class count_Occurences extends first_last_Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 2, 3, 4, 4, 4, 5, 6 };

        System.out.println("Enter the number");

        int x = sc.nextInt();

        // Step 1 - find the first occurence in the left side
        // Step 2 - find the last occurence in the right side

        int fOccur = first(arr, x);
        int lOccur = second(arr, x);

        int total_Occurence = lOccur - fOccur + 1;
        System.out.println("Total Occurence of " + x + "=> " + total_Occurence);
    }
}
