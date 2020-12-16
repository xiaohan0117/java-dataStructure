package cn.sortlist.list;

import cn.utils.CommonUtils;

/**
 * @ClassName : QuickSort
 * @Description : 快速排序
 * @Author : wangxh
 * @Date: 2020-12-14 22:04
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {6,4,5,9,8,5,7};
        int low = 0,high = arr.length -1;
        quickSort(arr,low,high);
        CommonUtils.printArray(arr);
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high){
            int index = getMidIndex(arr,low,high);
            quickSort(arr,low,index-1);
            quickSort(arr,index+1,high);
        }
    }

    /**
     *      6  ,   4   ,   5   ,   9   ,   8   ,   5   ,7
     * 索引 0      1       2       3       4       5    6
     *    key：arr[low] = 6
     */
    private static int getMidIndex(int[] arr, int low, int high) {
        int key = arr[low];
        while (low < high){
            while (low < high && key <= arr[high]){
                high--;
            }
            arr[low] = arr[high];
            while (low < high && arr[low] <= key){
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = key;
        return low;
    }


}
