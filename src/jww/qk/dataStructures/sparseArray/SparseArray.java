package jww.qk.dataStructures.sparseArray;

/**
 * @author Qiankun
 * @date 2020/2/16 0016 -16:57
 * @title 稀疏数组
 **/
public class SparseArray {

    private static final int M_LENGTH = 11;

    public static void main(String[] args){
        int[][] a = new int[M_LENGTH][M_LENGTH];
        a[1][2] = 1;
        a[2][3] = 2;

//        for(int[] new_a : a){
//            for(int new_b : new_a){
//                System.out.printf("%d\t",new_b);
//            }
//            System.out.println();
//        }

        int sum = 0;
        for(int i = 0; i < M_LENGTH; i++){
            for (int j = 0; j < M_LENGTH; j++) {
                if(a[i][j] != 0){
                    sum++;
                }
            }
        }

        //System.out.println(sum);

        int[][] b = new int[sum + 1][3];
        b[0][0] = M_LENGTH;
        b[0][1] = M_LENGTH;
        b[0][2] = sum;

        int k1 = 1;
        int k2 = 0;
        for(int i = 0; i < M_LENGTH; i++){
            for(int j = 0; j < M_LENGTH; j++){
                if(a[i][j] != 0){
                    b[k1][0] = i;
                    b[k1][1] = j;
                    b[k1][2] = a[i][j];
                    //System.out.println("i:"+b[k1][0] + "\tj:" + b[k1][1] + "\tvalue:" + b[k1][2]);
                    k1++;
                }
            }
        }

        for(int[] new_a : b){
            for(int new_b : new_a){
                System.out.printf("%d\t",new_b);
            }
            System.out.println();
        }




        int temp_x = b[0][0];
        int temp_y = b[0][1];
        int temp_sum = b[0][2];
        int [][] c = new int[temp_x][temp_y];
        for (int i = 1; i < temp_sum + 1; i++) {
                int temp_xx = b[i][0];
                int temp_yy = b[i][1];
                int temp_value = b[i][2];

                c[temp_xx][temp_yy] = temp_value;

        }


        for(int i = 0; i < temp_x; i++){
            for (int j = 0; j < temp_y; j++) {
                System.out.printf("%d\t",c[i][j]);
            }
            System.out.println();
        }
    }
}
