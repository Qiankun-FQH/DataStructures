package jww.qk.dataStructures.sort.radix_sort;

import java.util.Arrays;

/**
 * @author Administrator
 * @date 2020-${MONTER}-25 18:14
 * @title
 **/
public class RadixSort {
    public static void main(String[] args) {
        int arr[] = {
                53, 3, 542, 748, 14, 214
        };
        radixSort(arr);
    }

    private static void radixSort(int[] arr) {

        int[][] bucket = new int[10][arr.length];
        int[] bucketElementCounts = new int[10];

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        int maxLength = (max + "").length();
        for (int i = 0, n = 1; i < maxLength; i++, n *= 10) {
            for (int j = 0; j < arr.length; j++) {
                int digitOfElemennt = (arr[j] / n) % 10;
                bucket[digitOfElemennt][bucketElementCounts[digitOfElemennt]] = arr[j];
                bucketElementCounts[digitOfElemennt]++;
            }

            int index = 0;
            for (int k = 0; k < bucketElementCounts.length; k++) {
                    for (int l = 0; l < bucketElementCounts[k]; l++) {
                        arr[index] = bucket[k][l];
                        index++;
                    }
                bucketElementCounts[k] = 0;
            }
        }

    }
}
