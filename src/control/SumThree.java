package control;
/**
 * @Author: yangli16
 * @Description: 求和13-23+33-43+...+973-983+993-1003的值
 * @Date: 0:45 2019/10/19
 */
public class SumThree {
    public static void main(String[] args) {
        System.out.println(getSum());
    }
    /**
     * @Author: yangli
     * @Description: 求和13-23+33-43+...+973-983+993-1003的值
     * @Date: 0:44 2019/10/19
     * @return: int
     */
    static int getSum(){
        int sum=0;
        for (int i =13,j=1 ;i <= 1003 ; j++){
            sum += j % 2 != 0 ? i : -i;
            i += 10;
        }
        return sum;
    }
}
