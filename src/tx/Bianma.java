package tx;

public class Bianma {
    public static void main(String[] args) {
        int num1 = 25 * 25 * 25 + 25 + 25 * 25 + 1;
        int num2 = 25 * 25 + 25 + 1;
        int num3 = 26;
        int res = 0;
        String s = "baca";
        res += (s.charAt(0) - 'a') * num1;
        res += (s.charAt(1) - 'a') * num2;
        res += (s.charAt(2) - 'a') * num3;
        res += (s.charAt(3) - 'a');
        System.out.println(res);
    }
}
/*
假定一种编码的编码范围是a ~ y的25个字母，从1位到4位的编码，如果我们把该编码按字典序排序，形成一个数组如下：
a, aa, aaa, aaaa, aaab, aaac, … …, b, ba, baa, baaa, baab, baac … …, yyyw, yyyx, yyyy
其中a的Index为0，aa的Index为1，aaa的Index为2，以此类推。 编写一个函数，输入是任意一个编码，输出这个编码对应的Index.

输入一个待编码的字符串,字符串长度小于等于100.
输出描述:
输出这个编码的index
示例1
输入
baca
输出
16331
 */
