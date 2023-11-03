import java.util.*;

class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char[] str = input.toCharArray();
        int start = 0;
        int end = str.length - 1;

        while (start < end) {

            char ch = str[start];
            str[start] = str[end];
            str[end] = ch;
            start++;
            end--;
        }

        System.out.println("Reversed String -> " + Arrays.toString(str));
    }
}