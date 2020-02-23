package jww.qk.dataStructures.sort.Insert_sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author Qiankun
 * @date 2020/2/21 0021 -16:18
 * @title
 **/
public class InsertSort {
public static void main(String[] args){
//            int arr[] = {
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

       insertSort(arr);

    Date data = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String format = simpleDateFormat.format(data);
    System.out.println("排序前的时间" + format);

    /**
     * 排序前的时间2020-02-23 13:13:56
     * 排序前的时间2020-02-23 13:14:00
     */

}
    private static void insertSort(int[] arr) {

        for(int i = 1; i < arr.length; i++){
            int insertVal = arr[i];
            int insertIndex = i - 1;
            while(insertIndex >= 0 && insertVal < arr[insertIndex]){

                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            if(insertIndex + 1 != i){
                arr[insertIndex + 1] = insertVal;
            }

        }

    }
}
