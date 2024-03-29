package bd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZJ3 {
    public static void main(String[] args) {
        int n, m;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            n = scanner.nextInt();
            m = scanner.nextInt();
            String s = scanner.next();
            System.out.println(Math.max(getLength(s, m, 'a'), getLength(s, m, 'b')));
        }
    }

    public static int getLength(String s, int m, char ch) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                list.add(i);
            }
        }
        if (list.size() <= m)
            return s.length();
        list.add(s.length());
        int max = list.get(m);
        for (int i = m+1; i  < list.size(); i++) {
            max=Math.max(max,list.get(i)-list.get(i-m-1)-1);
        }
        return max;
    }
}
/*
题目描述
有一个仅包含’a’和’b’两种字符的字符串s，长度为n，每次操作可以把一个字符做一次转换（把一个’a’设置为’b’，或者把一个’b’置成’a’)；
但是操作的次数有上限m，问在有限的操作数范围内，能够得到最大连续的相同字符的子串的长度是多少。
输入描述:
第一行两个整数 n , m (1<=m<=n<=50000)，第二行为长度为n且只包含’a’和’b’的字符串s。
输出描述:
输出在操作次数不超过 m 的情况下，能够得到的 最大连续 全’a’子串或全’b’子串的长度。
示例1
输入
复制
8 1
aabaabaa
输出
复制
5
说明
把第一个 'b' 或者第二个 'b' 置成 'a'，可得到长度为 5 的全 'a' 子串。
 */
