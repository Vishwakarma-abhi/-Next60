import java.util.*;

public class shuffleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "abc";
        int indices[] = { 0, 1, 2 };

        String ans = "";

        HashMap<Integer, Character> map = new HashMap<>();

        for (int i = 0; i < indices.length; i++) {
            map.put(indices[i], s.charAt(i));
        }

        for (int i = 0; i < indices.length; i++) {
            ans += map.get(i);
        }

        System.out.println(ans);

    }
}
