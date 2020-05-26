package dataStructrues.stack.迷宫问题;

public class MiGong {
    static int[][] map;
    public static void main(String[] args) {
        init();

        setWay(map,1,1);

        System.out.println("小球走过，并标记过的递归");
        for (int i = 0; i<8; i++){
            for (int j = 0; j <7 ; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * 初始化，迷宫。
     */
    public static void init(){
        // 准备迷宫数组
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
        if (map[6][5] == 2){
            return true;
        }else{
            if (map[i][j] == 0){
                map[i][j] = 2;
                if (setWay(map,i+1,j)){
                    return true;
                } else if (setWay(map,i,j+1)){
                    return true;
                } else if (setWay(map,i-1,j)){
                    return true;
                } else if (setWay(map,i,j-1)){
                    return true;
                }else {
                    map[i][j] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }


}
