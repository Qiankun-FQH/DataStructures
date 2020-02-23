package jww.qk.dataStructures.sort.quick_sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author Qiankun
 * @date 2020/2/21 0021 -15:28
 * @title
 **/
public class QuickSort {
    public static void main(String[] args){
        int arr[] = {
                -9,78,0,23,-567,70
        };

//        int [] arr = new int[80000];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 8000000);
//        }
//
//        Date data = new Date();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String format = simpleDateFormat.format(data);
//        System.out.println("排序前的时间" + format);


        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

//        Date data2 = new Date();
//        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String format2 = simpleDateFormat.format(data2);
//        System.out.println("排序前的时间" + format2);
//

    }

    private static void quickSort(int[] arr, int left, int right) {
        int l = left;
        int r = right;

        int pivot = arr[(l + r) / 2];
        while(l < r){
            while(arr[l] < pivot){
                l++;
            }
            while(arr[r] > pivot){
                r--;
            }
            if(l >= r){
                break;
            }
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            if(arr[l] == pivot){
                r--;
            }
            if(arr[r] == pivot){
                l++;
            }
        }

        if(l == r){
            l++;
            r--;
        }
        if(left < r){
            quickSort(arr,left,r);
        }
        if(right > l){
            quickSort(arr,l,right);
        }
    }
}
