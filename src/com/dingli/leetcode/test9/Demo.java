package com.dingli.leetcode.test9;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒叙（从右向左）读都是一样的整数。
 * 示例1：
 * 输入：121
 * 输出：true
 *
 * 示例：2
 * 输入：-121
 * 输出：false
 *
 * 解释：从左向右读，为-121。从右向左读，为121-。因此它不是一个回文数。
 */
public class Demo {
    public static void main(String[] args) {

        boolean b = method(456);
        System.out.println(b);

    }


    public static boolean method(int i) {
        int x = i % 10;
        int y = i / 10 % 10;
        int z = i / 10 / 10 % 10;
        if ((x * 100 + y * 10 + z) == i) {
             return true;
        } else {
            return false;
        }
    }
}
