import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CandiesProblem {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        // first find the kid having the highest candies
        int maxCanIndex = 0;
        int max = Integer.MIN_VALUE;
        int n = candies.length;
        for (int i = 0; i < n; i++) {
            if (candies[i] > max) {
                max = candies[i];
                maxCanIndex = i;
            }
        }

        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if ((candies[i] + extraCandies) >= candies[maxCanIndex]) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int candies[] = new int[n];

        for (int i = 0; i < candies.length; i++) {
            candies[i] = sc.nextInt();
        }

        System.out.println("Enter number of extra candies");
        int extra = sc.nextInt();

        List<Boolean> list = kidsWithCandies(candies, extra);

        System.out.println(list);

    }
}