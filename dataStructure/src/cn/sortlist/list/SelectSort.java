package cn.sortlist.list;

import cn.utils.CommonUtils;

/**
 * @ClassName : SelectSort
 * @Description : 选择排序
 * @Author : wangxh
 * @Date: 2020-12-14 22:42
 */
public class SelectSort {

    public static void main(String[] args) {
        int[] arr = {6,4,3,9,8,5,7};
        selectSort(arr);
        CommonUtils.printArray(arr);

    }

    private static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[i]){// 3 6 4 9 8 5 7
                    int temp = arr[j];//
                    arr[j] = arr[i];//
                    arr[i] = temp;//
                }
            }
        }
    }

}
