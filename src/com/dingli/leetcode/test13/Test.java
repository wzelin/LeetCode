package com.dingli.leetcode.test13;


import java.util.HashMap;
import java.util.Map;

/**
 * 罗马数字包含以下七种字符：I,V,X,L,C,D,M.
 * 字符   数值
 * I    1
 * V    5
 * X    10
 * L    50
 * C    100
 * D    500
 * M    1000
 *
 * 例如，罗马数字2写作II，即为两个并列的1。12写作XII，即为X + II。27写作XXVII，即为XX + V + II。
 * 通常情况下，罗马数字中小的数字在大的数字右边。但也存在特例，例如4不写作IIII，而是IV。数字1在数字5的左边，所表示的数等于大数5减小数1的到的数值4.
 * 同样地，数字9表示为IX。这个特殊的规则只适用于以下6种情况：
 *      I可以放在V（5）和X（10）的左边，来表示4和9。
 *      X可以放在L（50）和C（100）的左边，来表示40和90。
 *      C可以放在D（500）和M（1000）的左边，来表示400和900。
 *
 * 给定一个罗马数字，将其转换成整数，输入确保在1到3999的范围。
 *
 * 示例1：
 * 输入："III"
 * 输出：3
 *
 * 示例2：
 * 输入："IV"
 * 输出：4
 *
 * 示例3：
 * 输入："IX"
 * 输出：9
 *
 * 示例4：
 * 输入："LVIII"
 * 输出："58"
 * 解释：C = 100, L = 50, XXX = 30, III = 3
 *
 * 示例5：
 * 输入："MCMXCIV"
 * 输出：1994
 * 解释：M = 1000, CM = 900, XC = 90, IV = 4
 */
public class Test {
    public static void main(String[] args) {

        int i = romanToInt("MCMXCIV");
        System.out.println(i);

    }

    public static int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result = 0;
        for (int i = 0; i < s.length(); i ++) {
            if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))){
                result += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
            } else {
                result += map.get(s.charAt(i));
            }
        }

        return result;
    }

}
