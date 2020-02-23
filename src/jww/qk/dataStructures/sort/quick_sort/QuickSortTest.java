package jww.qk.dataStructures.sort.quick_sort;

import java.util.Arrays;

/**
 * @author Qiankun
 * @date 2020/2/23 0023 -15:32
 * @title
 **/
public class QuickSortTest {
    public static void main(String[] args){
        int [] arr = new  int[]{
                -9,78,0,23,-567,70
        };

        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr, int left, int right) {
        int l = left;
        int r = right;
        int mid = arr[(l + r) / 2];

        while(l < r){
            while(arr[l] < mid)
                l++;
            while(arr[r] > mid)
                r--;
            if(l == r)
                break;
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            if(arr[l] == mid)
                r--;
            if(arr[r] == mid)
                l++;
        }
        if(l == r){
            l++;
            r--;
        }
        if(left < r)
            sort(arr, left, r);
        if(right > l)
            sort(arr, l, right);

    }
}
