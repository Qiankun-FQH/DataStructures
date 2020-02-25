package jww.qk.dataStructures.search.seq_search;

/**
 * @author Administrator
 * @date 2020-${MONTER}-25 19:13
 * @title
 **/
public class SeqSearch {
    public static void main(String[] args){
        int arr[] = {
          1,9,11,-1,34,89
        };
        int i = seqSearch(arr, 11);
        System.out.println(i);
    }

    private static int seqSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == value){
                return i;
            }
        }
        return -1;
    }
}
