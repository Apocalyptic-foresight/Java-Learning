package control;
/**
 * @Author: yangli
 * @Description: 求1!+2!+***+20!
 * @Date: 1:10 2019/10/19
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(sum(20));
    }

    /**
     * @Author: yangli
     * @Description: 递归法求和
     * @Date: 1:09 2019/10/19
     * @Param: num
     * @return: long
     */
    static long sum(int num){
        if (num==1){
            return 1;
        }
        return sum(num-1) + getFactorial(num);
    }

    /**
     * @Author: yangli
     * @Description: 递归法获取阶乘
     * @Date: 1:08 2019/10/19
     * @Param: num
     * @return: long
     */
    static long getFactorial(int num) {
        if (num == 1) {
            return 1;
        }
        return getFactorial(num-1) * num;
    }
}
