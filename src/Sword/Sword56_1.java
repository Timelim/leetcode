package Sword;

public class Sword56_1 {
    public int[] singleNumbers(int[] nums) {
        int split = nums[0];
        for (int i = 1; i < nums.length; i++)
            split ^= nums[i];
        int count = 1;
        while ((split & count) == 0) {
            count <<= 1;
        }
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & count) == 0)
                num1 ^= nums[i];
            else num2 ^= nums[i];
        }
        return new int[]{num1, num2};
    }
}
/*
一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
示例 1：

输入：nums = [4,1,4,6]
输出：[1,6] 或 [6,1]
示例 2：
输入：nums = [1,2,10,4,1,4,3,3]
输出：[2,10] 或 [10,2]
限制：
2 <= nums.length <= 10000
来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */