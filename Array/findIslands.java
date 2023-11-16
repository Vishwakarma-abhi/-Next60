import java.util.*;

public class findIslands {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();
        int mat[][] = new int[row][col];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int totalIslands = countIslands(mat);
        System.out.println("Total Islands => " + totalIslands);
    }

    private static int countIslands(int[][] mat) {

        int row = mat.length;
        int col = mat[0].length;
        int count = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 1) {
                    count++;
                    dfs(mat, i, j, row, col);
                }
            }
        }
        return count;
    }

    private static void dfs(int[][] mat, int i, int j, int row, int col) {

        if (i < 0 || j < 0 || i > (row - 1) || j > (col - 1) || mat[i][j] != 1) {
            return;
        }

        if (mat[i][j] == 1) {
            mat[i][j] = 0;

            dfs(mat, i + 1, j, row, col);

            dfs(mat, i - 1, j, row, col);
            dfs(mat, i, j + 1, row, col);
            dfs(mat, i, j - 1, row, col);

            dfs(mat, i + 1, j + 1, row, col);
            dfs(mat, i - 1, j - 1, row, col);
            dfs(mat, i + 1, j - 1, row, col);
            dfs(mat, i - 1, j + 1, row, col);
        }

    }
}
