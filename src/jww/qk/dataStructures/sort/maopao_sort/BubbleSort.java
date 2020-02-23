package jww.qk.dataStructures.sort.maopao_sort;

import javax.swing.plaf.synth.SynthSpinnerUI;

import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author Qiankun
 * @date 2020/2/21 0021 -15:28
 * @title
 **/
public class BubbleSort {
    public static void main(String[] args){
//        int arr[] = {
//                3, 9, -1, 10, 20
//        };

        //O(n^2)
        int [] arr = new int[80000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 8000000);
        }

        Date data = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(data);
        System.out.println("排序前的时间" + format);


        bubbleSort(arr);


        Date data2 = new Date();
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format2 = simpleDateFormat.format(data2);
        System.out.println("排序前的时间" + format2);
        /*
        排序前的时间2020-02-21 15:49:18
        排序前的时间2020-02-21 15:49:42
         */

    }

    private static void bubbleSort(int[] arr) {
        boolean flag = false;
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if(arr[i] > arr[i + 1]){
                    flag = true;
                    int temp = arr[i];
                    arr[i] = arr[ i + 1];
                    arr[i + 1] = temp;
                }
            }
//            System.out.println("第"+ (j + 1) + "趟排序后的数组");
//            System.out.println(Arrays.toString(arr));
            if(!flag){
                break;
            }else{
                flag = false;
            }
        }

    }
}
