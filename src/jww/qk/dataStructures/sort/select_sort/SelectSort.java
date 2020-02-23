package jww.qk.dataStructures.sort.select_sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author Qiankun
 * @date 2020/2/21 0021 -15:51
 * @title
 **/
public class SelectSort {
    public static void main(String[] args){
//        int arr[] = {
//                101, 34, 119, 1
//        };
        int [] arr = new int[80000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 8000000);
        }
        Date data2 = new Date();
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format2 = simpleDateFormat2.format(data2);
        System.out.println("排序前的时间" + format2);

        selectSort(arr);

        Date data = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(data);
        System.out.println("排序前的时间" + format);

        /**
         * 排序前的时间2020-02-21 16:13:00
         * 排序前的时间2020-02-21 16:13:06
         */
    }
    private static void selectSort(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++){
            int minIndex = i;
            int min = arr[i];
            for(int j = i + 1; j < arr.length; j++){
                if(min > arr[j]){
                    min = arr[j];
                    minIndex = j;
                }
            }
            if(minIndex != i){
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }


    }
}
