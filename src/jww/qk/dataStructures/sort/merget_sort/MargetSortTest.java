package jww.qk.dataStructures.sort.merget_sort;



import java.util.Arrays;

/**
 * @author Administrator
 * @date 2020-${MONTER}-25 16:33
 * @title
 **/
public class MargetSortTest {
    public static void main(String[] args){
        int arr[] = {
                8, 4, 5, 7, 1, 3, 6,2
        };
        int[] temp = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1, temp);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int left, int right, int[] temp) {
        if(left < right){
            int mid = (left + right) / 2;
            mergeSort(arr,left, mid,temp);
            mergeSort(arr,mid + 1,right, temp);
            merge(arr,left,mid,right,temp);
        }
    }
    private static void merge(int[] arr, int left,int mid, int right, int[] temp) {
            int l = left;
           int r = mid + 1;
           int t = 0;
           while (l <= mid && r <= right){
               if(arr[l] < arr[r])
                   temp[t++] = arr[l++];
               else
                   temp[t++] = arr[r++];
           }
           while (l <= mid)
               temp[t++] = arr[l++];
           while (r <= right)
               temp[t++] = arr[r++];

           t = 0;
           int leftTemp = left;
           while (leftTemp <= right)
               arr[leftTemp++] = arr[t++];
    }
}
