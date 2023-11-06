import java.util.*;

public class lcs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[10];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }

        String res = longestCommonPrefix(str);

        System.out.println(res);

    }

    public static String longestCommonPrefix(String[] str) {

        // String array is sorted Lexicograohical order

        Arrays.sort(str);
        // str[] = {"flight", "flow"," flower"}
        String s1 = str[0];
        String s2 = str[str.length - 1];
        String res = "";
        int i = 0;
        while (i < s1.length() && i < s2.length()) {
            if (s1.charAt(i) != s2.charAt(i)) {
                break;
            } else {
                res += s1.charAt(i);
                i++;
            }

        }
        return res;

    }
}
