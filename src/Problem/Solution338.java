package Problem;

public class Solution338 {
    public int[] countBits(int num) {
        int res[]=new int [num+1];
        for(int i=0;i<=num;i++){
            int count=0;
            int tmp=i;
            while (tmp!=0){
                int j=tmp%2;
                if(j==1)
                    count+=1;
                tmp=tmp>>1;

            }
            res[i]=count;
        }
        for(int i=0;i<=num;i++)
            System.out.println(res[i]);
        return res;
    }

    public static void main(String[] args) {
        Solution338 t= new Solution338();
        t.countBits(2);
    }
}
/*
338. 比特位计数
给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，计算其二进制数中的 1 的数目并将它们作为数组返回。

示例 1:

输入: 2
输出: [0,1,1]
示例 2:

输入: 5
输出: [0,1,1,2,1,2]
进阶:

给出时间复杂度为O(n*sizeof(integer))的解答非常容易。但你可以在线性时间O(n)内用一趟扫描做到吗？
要求算法的空间复杂度为O(n)。
你能进一步完善解法吗？要求在C++或任何其他语言中不使用任何内置函数（如 C++ 中的 __builtin_popcount）来执行此操作。
通过次数67,561提交次数88,375
 */