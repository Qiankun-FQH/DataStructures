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
//3,2,1
    //1,2,3
    private static void sort(int[] arr, int left, int right) {
        int l = left;
        int r = right;
        int mid = arr[(l + r) / 2];
        while (l < r){
            while(arr[l] < mid)
                l++;
            while (arr[r] > mid)
                r--;
            if(l == r)
                break;
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            if(arr[l] == mid)//1,3,2,5,2,2 // 1,2,2,5,2,3
                r--;
            if(arr[r] == mid)
                l++;
        }
        if(l == r){
            l++;
            r--;
        }
        if(l < right)
            sort(arr, l, right);
        if(r > left)
            sort(arr, left, r);

    }
}
