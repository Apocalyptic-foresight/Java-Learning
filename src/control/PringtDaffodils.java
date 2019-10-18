package control;
/**
 * 打印出所有的“水仙花数”，所谓“水仙花数”是指一个三位数，其各位数字立方和等于该数本身。
 * 例如：153是一个“水仙花数”，因为153=1的三次方＋5的三次方＋3的三次方
 * 求100~~~1000内所有水仙花数
 * @Author: yangli16
 * @Description: //TODO
 * @Date: 0:07 2019/10/19
 */
public class PringtDaffodils {
    final static int MAX_NUMBER = 999;
    final static int MIN_NUMBER = 100;

    public static void main(String[] args) {
        getDaffodils();
    }

    /**
     * @Author: yangli16
     * @Description: 获取水仙花数
     * @Date: 0:07 2019/10/19
     */
    static void getDaffodils() {
        for (int i = MIN_NUMBER; i <= MAX_NUMBER; i++) {
            int bits = i % 10;
            int ten = (i / 10) % 10;
            int hundred = i / 100;
            int result = bits * bits * bits + ten * ten * ten + hundred * hundred * hundred;
            if (i == result) {
                System.out.printf(i + "\t");
            }
        }
    }
}
