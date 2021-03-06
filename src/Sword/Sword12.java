package Sword;

import java.util.Arrays;

/**
 * @author jc
 * dfs
 */
public class Sword12 {
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        if (n * m < word.length())
            return false;
        if (n == 1 && m == 1)
            return word.charAt(0) == board[0][0];

        char[] tmp = word.toCharArray();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(dfs(board, i, j, 0, tmp))
                    return true;
            }
        }
        return false;
    }


    public boolean dfs(char[][] board, int row, int col, int index, char[] word) {
        int n = board.length;
        int m = board[0].length;
        if (row >= n || col >= m || row < 0 || col < 0 || board[row][col] != word[index]) {
            return false;
        }
        if (index == word.length - 1) {
            return true;
        }
        //visit

        board[row][col] = '\0';
        boolean res = dfs(board, row, col + 1, index + 1, word) ||
                dfs(board, row, col - 1, index + 1, word) ||
                dfs(board, row + 1, col, index + 1, word) ||
                dfs(board, row - 1, col, index + 1, word);
        board[row][col] = word[index];
        return res;
    }

    public static void main(String[] args) {
        Sword12 t = new Sword12();
        boolean numberIn2DArray = t.exist(new char[][]{
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}}, "ABCCED");
        System.out.println(numberIn2DArray);
    }


}
/*
请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中的任意一格开始，
每一步可以在矩阵中向左、右、上、下移动一格。如果一条路径经过了矩阵的某一格，那么该路径不能再次进入该格子。
例如，在下面的3×4的矩阵中包含一条字符串“bfce”的路径（路径中的字母用加粗标出）。
[["a","b","c","e"],
["s","f","c","s"],
["a","d","e","e"]]
但矩阵中不包含字符串“abfb”的路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入这个格子。
示例 1：
输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
输出：true
示例 2：
输入：board = [["a","b"],["c","d"]], word = "abcd"
输出：false
提示：
1 <= board.length <= 200
1 <= board[i].length <= 200

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */