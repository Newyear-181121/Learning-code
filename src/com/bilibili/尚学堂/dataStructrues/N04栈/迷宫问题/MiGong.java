package dataStructrues.N04栈.迷宫问题;

public class MiGong {
    static int[][] map;
    public static void main(String[] args) {
        init();

        setWay(map,1,1);  // 一直递归判断就可以了，

        System.out.println("小球走过，并标记过的递归");
        for (int i = 0; i<8; i++){
            for (int j = 0; j <7 ; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * 初始化，迷宫。  准备一个迷宫，，
     */
    public static void init(){
        map = new int[8][7];
        // 先根据视屏 初始化迷宫数组
        for (int i = 0; i< 7; i++){
            map[0][i]= 1;
            map[7][i] = 1;
        }
        for (int i = 0 ; i<8 ; i++){
            map[i][0] = 1;
            map[i][6] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        System.out.println("地图情况");
        for (int i = 0; i<8; i++){
            for (int j = 0; j <7 ; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     *
     * @param map 地图数组
     * @param i  开始位置的 i
     * @param j
     * @return 如果找到，则返回 true。
     */
    public static boolean setWay(int[][] map , int i,int j){
        if (map[6][5] == 2){ // 是否是终点位置。  有没有到终点，到了就ok
            return true;
        }else{ //不是终点位置，
            if (map[i][j] == 0){ //判断当前位置有没有走过。 如果没走过，
                map[i][j] = 2;  // 先临时赋值 2
                if (setWay(map,i+1,j)){  //判断右边是否可以走。   //用递归判断是否可以走。
                    return true;        // 可以走 就 ok
                } else if (setWay(map,i,j+1)){
                    return true;
                } else if (setWay(map,i-1,j)){
                    return true;
                } else if (setWay(map,i,j-1)){
                    return true;
                }else { // 四个方向都不能走，就把这个位置 设置成 3，再返回。
                    map[i][j] = 3;
                    return false;
                }
            } else { // 如果 这个位置是走过的，或者是墙，就直接 干掉。
                return false;
            }
        }
    }


}
