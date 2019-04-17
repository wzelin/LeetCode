package com.dingli.leetcode.test7;


/**
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0
 */
public class Demo {
    public static void main(String[] args) {

        int i = reverse(1234567898);
        System.out.println(i);

    }

    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Short.MAX_VALUE / 10 || (rev == Short.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (rev < Short.MIN_VALUE / 10 || (rev == Short.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            rev = (rev * 10 + pop);
        }
        return rev;
    }
}
