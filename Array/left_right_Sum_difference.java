import java.util.*;

class left_Right_Sum_Difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size");
        int size = sc.nextInt();
        int nums[] = new int[size];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int arr[] = leftRightDifference(nums);
        System.out.println("Resultant Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] leftRightDifference(int[] nums) {

        int leftSum[] = new int[nums.length];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            leftSum[i] = sum;
            sum += nums[i];
        }

        int rightSum[] = new int[nums.length];
        sum = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            rightSum[i] = sum;
            sum += nums[i];
        }

        int ans[] = new int[nums.length];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return ans;

    }
}