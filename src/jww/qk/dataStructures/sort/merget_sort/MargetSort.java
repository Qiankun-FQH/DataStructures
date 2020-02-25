package jww.qk.dataStructures.sort.merget_sort;


import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author Administrator
 * @date 2020-${MONTER}-25 16:11
 * @title
 **/
public class MargetSort {
    public static void main(String[] args){
//        int arr[] = {
//             8,4,5,7,1,3,6,2
//        };

        int [] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 8000000);
        }
        int [] b = new int[arr.length];

        Date data = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(data);
        System.out.println("排序前的时间" + format);


        mergeSort(arr, 0,arr.length - 1, b);

        System.out.println(Arrays.toString(arr));

        Date data2 = new Date();
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format2 = simpleDateFormat.format(data2);
        System.out.println("排序前的时间" + format2);
        /**
         * 排序前的时间2020-02-25 16:31:03
         * 排序前的时间2020-02-25 16:31:03
         */

    }

    public static void mergeSort(int[] arr, int left, int right, int[] temp){
            if(left < right){
                int mid = (left + right) / 2;
                mergeSort(arr,left,mid,temp);
                mergeSort(arr, mid+1,right,temp);
                merge(arr,left,mid,right,temp);
            }
    }

    public static void merge(int[] arr, int left, int mid, int right, int[] temp){

        int i = left;
        int j = mid + 1;
        int t = 0;

        while (i <= mid && j <= right){
            if(arr[i] < arr[j]){
                temp[t] = arr[i];
                t++;
                i++;
            }else{
                temp[t] = arr[j];
                t++;
                j++;
            }
        }

        while (i <= mid){
            temp[t] = arr[i];
            t++;
            i++;
        }
        while (j <= right){
            temp[t] = arr[j];
            t++;
            j++;
        }
        t = 0;
        int tempLeft = left;
        while (tempLeft <= right){
            arr[tempLeft] = temp[t];
            t++;
            tempLeft++;
        }
    }
}
