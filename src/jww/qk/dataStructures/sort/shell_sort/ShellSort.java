package jww.qk.dataStructures.sort.shell_sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author Qiankun
 * @date 2020/2/21 0021 -16:18
 * @title
 **/
public class ShellSort {
public static void main(String[] args){
//    int arr[] = {
//            8, 9, 1, 7, 2, 3, 5, 4, 6, 0
//    };
    int [] arr = new int[80000];

    for (int i = 0; i < arr.length; i++) {
        arr[i] = (int) (Math.random() * 8000000);
    }
    Date data2 = new Date();
    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String format2 = simpleDateFormat2.format(data2);
    System.out.println("排序前的时间" + format2);

       shellSort(arr);

    Date data = new Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String format = simpleDateFormat.format(data);
    System.out.println("排序前的时间" + format);

    /**
     * 排序前的时间2020-02-23 13:26:12
     * 排序前的时间2020-02-23 13:26:13
     */


}

    private static void shellSort(int[] arr) {
        for (int i = arr.length / 2; i > 0; i /= 2) {
            for(int j = i; j < arr.length; j++){
                int k = j;
                int temp = arr[k];
                while(k - i >= 0 && temp < arr[k - i]){
                    arr[k] = arr[k - i];
                    k -= i;
                }
                arr[k] = temp;
            }
        }
    }
}
