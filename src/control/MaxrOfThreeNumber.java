package control;

import java.util.Scanner;
/**
 * 获取3位数中最大的数
 * @Author: yangli16
 * @Description: 获取3位数中最大的数
 * @Date: 0:26 2019/10/19
 */
public class MaxrOfThreeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入3位数字:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int maxNumber = getMaxNumber(num1, num2, num3);
        System.out.println("最大数字为:" + maxNumber);
    }

    /**
     * @Author:
     * @Description: 获取3位数中最大的数
     * @Date: 0:26 2019/10/19
     * @Param: [a, b, c]
     * @return: int
     */
    static int getMaxNumber(int a, int b, int c) {
        int num;
        num = a > (b > c ? b : c) ? a : (b > c ? b : c);
        return num;
    }
}
