package Arrays;

import java.util.Scanner;
/**
 * @Author: yangli16
 * @Description: 冒泡排序
 * @Date: 11:16 2019/10/19
 */
public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("请输入整数数组大小:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("请输入数组需排序数组:");
        int[] ints = initArray(num);
        getArraySort(ints);
        System.out.println("排序后数组为:");
        printArray(ints);
    }

    /**
     * @Author: yangli
     * @Description: 对数组进行冒泡排序
     * @Date: 11:11 2019/10/19
     * @Param: [arr]
     * @return: void
     */
    static void getArraySort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] >= arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * @Author: yangli
     * @Description: 初始化数组
     * @Date: 11:12 2019/10/19
     * @Param: num
     * @return: int[]
     */
    static int[] initArray(int num) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = input.nextInt();
        }
        return arr;
    }

    /**
     * @Author: yangli
     * @Description: 打印数组
     * @Date: 11:12 2019/10/19
     */
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
