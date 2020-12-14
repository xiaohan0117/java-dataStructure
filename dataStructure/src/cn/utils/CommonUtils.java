package cn.utils;

/**
 * @ClassName : CommonUtils
 * @Description : 通用工具类
 * @Author : wangxh
 * @Date: 2020-12-13 18:49
 */
public class CommonUtils {

    public static void printArray(int[] arr){
        StringBuilder sb = new StringBuilder();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (i != len -1){
                sb.append(arr[i]+",");
            }else {
                sb.append(arr[i]);
            }
        }
        System.out.println(sb.toString());
    }

}
