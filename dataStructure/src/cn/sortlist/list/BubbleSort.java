package cn.sortlist.list;

import cn.utils.CommonUtils;

import java.util.Arrays;

/**
 * @ClassName : BubbleSort
 * @Description : 冒泡排序
 * @Author : wangxh
 * @Date: 2020-12-13 18:42
 */
public class BubbleSort {

    public static void main(String[] args) {
//        int[] arr = {4,6,5,9,1,2,5};
        int len = 10000;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = (int) (Math.random()*100);
        }
        int[] arr2 = Arrays.copyOf(arr,len);
        int[] arr3 = Arrays.copyOf(arr,len);
        // 冒泡排序
        Long currentTime = System.currentTimeMillis();
        bubbleSort(arr);
        Long endTime = System.currentTimeMillis();
        System.out.println("花费时间为："+(endTime - currentTime));
        CommonUtils.printArray(arr);
        // 快速排序
        Long currentTimeQuick = System.currentTimeMillis();
        QuickSort.quickSort(arr3,0,len-1);
        Long endTimeQuick = System.currentTimeMillis();
        System.out.println("花费时间为："+(endTimeQuick - currentTimeQuick));
        CommonUtils.printArray(arr3);
        // java自带排序
        Long currentTimeArrays = System.currentTimeMillis();
        Arrays.sort(arr2);
        Long endTimeArrays = System.currentTimeMillis();
        System.out.println(currentTimeArrays);
        System.out.println(endTimeArrays);
        System.out.println("Arrays花费时间为："+(endTimeArrays - currentTimeArrays));
        CommonUtils.printArray(arr2);
    }

    private static void bubbleSort(int[] arr) {
        // 外层循环：因为数组是两两比较，不需要跟本身比较，所以比较次数为arr.length - 1
        for (int i = 0; i < arr.length - 1; i++) {
            // 内层循环：因为每一次外层循环排序后最后一个都是最大值，所以内存循环次数为 arr.length - 1 -i
            for (int j = 0; j < arr.length - 1 -i; j++) {
                int temp;
                if (arr[j] > arr[j+1]){
                   CommonUtils.swap(arr,j,j+1);
                }
            }
        }
    }
}
