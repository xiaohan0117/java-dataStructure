package cn.sortlist.list;

import cn.utils.CommonUtils;

/**
 * @ClassName : BubbleSort
 * @Description : 冒泡排序
 * @Author : wangxh
 * @Date: 2020-12-13 18:42
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {4,6,5,9,1,2,5};
        bubbleSort(arr);
        CommonUtils.printArray(arr);
    }

    private static void bubbleSort(int[] arr) {
        // 外层循环：因为数组是两两比较，不需要跟本身比较，所以比较次数为arr.length - 1
        for (int i = 0; i < arr.length - 1; i++) {
            // 内层循环：因为每一次外层循环排序后最后一个都是最小值，所以内存循环次数为 arr.length - 1 -i
            for (int j = 0; j < arr.length - 1 -i; j++) {
                int temp;
                if (arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
