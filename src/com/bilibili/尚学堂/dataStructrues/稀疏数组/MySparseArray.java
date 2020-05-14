package dataStructrues.稀疏数组;

import org.jetbrains.annotations.NotNull;

/**
 *  把实例二维数组封装一下。
 */
public class MySparseArray {

    int sum = 0;        //计数，二维数组中非零数的个数。
    int row,column = 0;



    /**
     *  返回二维数组的稀疏数组。
     * @param array  传入一个二维数组
     */
    public int[][] to_simple(int[][] array){


        //创建 稀疏数组。--直接调用方法。

        for(int[] row : array){
            for (int data : row){
                if(data !=0){
                    sum ++;
                }
            }
        }

        int[][] sparse = getArray(sum+1);
        row = array.length;
        column = array[0].length;
        sparse[0][0] = array.length;
        sparse[0][1] = array[0].length;
        sparse[0][2] = sum;
        int count = 0;
        for(int i = 0 ; i < row ; i++){
            for (int j = 0 ; j < column ; j++){
               if (array[i][j] !=0){
                   count++;
                   sparse[count][0] = i;
                   sparse[count][1] = j;
                   sparse[count][2] = array[i][j];
               }
            }
        }
        return sparse;
    }

    /**
     * 输入稀疏数组，输出源数组。
     * @param simple_array
     */
    public int[][] to_array(int[][] simple_array){
        int[][] array= new int[simple_array[0][0]][simple_array[0][1]];
        for(int i = 1 ; i < simple_array.length; i++){
            array[simple_array[i][0]][simple_array[i][1]] = simple_array[i][2];
        }
        return array;
    }


    public int[][] getArray(){
        return getArray(10);
    }
    public int[][] getArray(int row){
        return new int[row][3];
    }
    public int[][] addArray(int[][] array){
        int sum = array.length;
        sum += 10;
        return new int[sum][];
    }


}
