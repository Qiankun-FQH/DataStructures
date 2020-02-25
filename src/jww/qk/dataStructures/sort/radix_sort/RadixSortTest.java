package jww.qk.dataStructures.sort.radix_sort;

import java.util.Arrays;

/**
 * @author Administrator
 * @date 2020-${MONTER}-25 18:42
 * @title
 **/
public class RadixSortTest {
    public static void main(String[] args) {
        int arr[] = {
                54,65,84,25,245,90,214
        };
        radixSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void radixSort(int[] arr) {
        int[][] bucket = new int[10][arr.length];
        int[] bucketCount = new int[10];

        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (max < arr[i])
                max = arr[i];
        int maxLength = (max + "").length();


        for (int i = 0, n = 1; i < maxLength; i++, n *= 10){
            for (int j = 0; j < arr.length; j++) {
                int d = (arr[j] / n) % 10;
                bucket[d][bucketCount[d]] = arr[j];
                bucketCount[d]++;
            }

            int index = 0;
            for (int j = 0; j < bucketCount.length; j++) {
                for (int k = 0; k < bucketCount[j]; k++) {
                    arr[index++] = bucket[j][k];
                }
                bucketCount[j] = 0;
            }
        }




    }
}
