package jww.qk.dataStructures.recursion;

/**
 * @author Qiankun
 * @date 2020/2/19 0019 -13:45
 * @title 八皇后问题
 **/
public class Queue8 {

    int max = 8;
    int [] array = new int[max];
    public static void main(String[] args){
        Queue8 queue8 = new Queue8();
        queue8.check(0);
    }

    private void check(int n){
        if(n == max){
            print();
            return;
        }
        for (int i = 0; i < max; i++) {
             array[n] = i;
             if(judge(n)){
                 check(n+1);
             }
        }
    }

    private boolean judge(int n){
        for (int i = 0; i < n; i++) {
            if(array[i] == array[n] || Math.abs(n-i) == Math.abs(array[n]-array[i])){
                return false;
            }
        }
        return true;
    }

    private void print(){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
