package dataStructrues.N01稀疏数组;

import org.junit.Test;

public class Test_MySparseArray {
    @Test
    public void test_sparse(){
        MySparseArray spares = new MySparseArray();
        int chessArr1[][] = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[3][3] = 2;
        System.out.println("遍历原数组");
        out(chessArr1);
        int[][] sparseArray = spares.to_simple(chessArr1);
        System.out.println("遍历稀疏数组");
        out(sparseArray);
        System.out.println("遍历稀疏数组还原的二维数组");
        out(spares.to_array(sparseArray));




    }

    // 遍历二维数组
    public void out(int[][] chessArr){
        for (int[] row : chessArr){
            for(int data : row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
    }


}
