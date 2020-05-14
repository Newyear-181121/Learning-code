package dataStructrues;

/**
 * 稀疏数组与二维数组的转化。
 */
public class SparseArray {
    public static void main(String[] args) {
        //1.创建二维数组

        int chessArr1[][] = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[3][3] = 2;

        for (int[] row : chessArr1){
            for(int data : row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

        // 将二维数组 转 稀疏数组
        // 1. 先遍历二维数组得到非0数据的个数
        int sum = 0;
        for (int i = 0 ; i <11 ; i++){
            for(int j = 0 ; j <11 ;j++){
                if (chessArr1[i][j] != 0) {
                    sum++ ;
                }
            }
        }

        // 2. 创建对应的稀疏数组
        int sparseArr[][] =  new int[sum + 1][3];
        //给稀疏数组赋值
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;

        // 遍历二维数组，将非零的数存到稀疏数组中
        int count = 0;
        for (int i = 0 ; i <11 ; i++){
            for(int j = 0 ; j <11 ;j++){
                if (chessArr1[i][j] != 0) {
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArr1[i][j];
                }
            }
        }

        //输出稀疏数组
        for(int i = 0; i< sparseArr.length; i++){
            System.out.printf("%d\t%d\t%d\t\n",sparseArr[i][0],sparseArr[i][1],sparseArr[i][2]);
        }


        // 稀疏数组转二维数组
        int chessArr2[][] = new int[sparseArr[0][0]][sparseArr[0][1]];

        for(int i = 1 ; i < sparseArr.length; i++){
            chessArr2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }
        //输出转化的二维数组
        for (int[] row : chessArr2){
            for(int data : row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
    }
}
