package dataStructrues.stack.八皇后问题;

public class Queue8 {
    //
    int max = 8;
    static int count = 0;
    static int judgeCount = 0;
    // 数组的下标表示行，数组中的值，表示列。
    int[] array = new int[max];

    public static void main(String[] args){
        Queue8 queue8 = new Queue8();
        queue8.check(0);
        System.out.println("第一个是 7 的解法有："+ queue8.count_7);
        System.out.println(count);
        System.out.printf("1\t2\t3\t4\t5\t6\t7\t8\n%d\t%d\t%d\t%d\t%d\t%d\t%d\t%d\n",queue8.count_0,queue8.count_1,queue8.count_2,queue8.count_3,queue8.count_4,queue8.count_5,queue8.count_6,queue8.count_7);
        System.out.println("一共进行了:"+judgeCount+"次");
    }

    /**
     * 2. 第二个方法，检查 节点是否符合条件。
     * 查看第 n 个 节点，与之前的每一个节点是否符合条件。
     * @param n
     * @return
     */
    private boolean judge(int n){
        judgeCount++;
        for (int i = 0; i < n ; i++) {
            // 判断是否在同列，和同一斜线。  （很坐标增量与纵坐标增量相同时，斜率是1，就是在45度的直线上。）
            if (array[i] == array[n] || Math.abs(n-i) == Math.abs(array[n] - array[i])){
                return false;
            }
        }
        return true;
    }

    /**
     * 1.第一个方法，先遍历输出结果，，先写测试用例。
     * 遍历输出
     */
    private void print(){

        ny_out();
        count++;
        for (int i = 0;i < array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();



    }

    /**
     * 3. 第3个方法，
     *   可以放置第n个节点后的，后续节点。
     * @param n
     */
    private void check(int n){
        if (n == max){  // 先做边界处理  ，，结尾处的边界处理。
            print(); // 在循环递归中，达到一个满足条件的解后，就会输出一个结果，
            return; // 输出一个结果后，退出这层递归，还会继续进行上层递归的循环，继续判断是否有满足条件的结果，直到输出所有结果的解。
        }
        for (int i = 0 ; i < max ; i++){ //处理非边界数据，
            array[n] = i;   // 执行循环体，，，，每次都会执行的步骤。
            if (judge(n)){ // 判断是否符合条件
                /**每层递归中都有一个循环。因此会有回溯 */
                check(n+1); // 如果符合，就递归处理后面的，
            } //如果不符合条件，就循环进行 i++ 操作，


        }
    }

    /******************************************************************************************/

    /**
     * 想加的一点小功能
     */
    int count_1 = 0;
    int count_2 = 0;
    int count_3 = 0;
    int count_4 = 0;
    int count_5 = 0;
    int count_6 = 0;
    int count_7 = 0;
    int count_0 = 0;




    private void check_me(int n){
        if (n == max){
            print();
            return;
        }
        for (int i = 0 ; i < max ; i++){
            array[n] = i;
            if (judge(n)) {
                check_me(n + 1);
            }


        }
    }

    /**
     * 运行一下就知道这是做什么的了。
     */
    private void ny_out(){

        if (array[0] == 0) count_0++;
        if (array[0] == 1) count_1++;
        if (array[0] == 2) count_2++;
        if (array[0] == 3) count_3++;
        if (array[0] == 4) count_4++;
        if (array[0] == 5) count_5++;
        if (array[0] == 6) count_6++;
        if (array[0] == 7) count_7++;

        if (count_1 == 1){
            System.out.println("第一个是 0 的解法有："+count_0);
        }
        if (count_2 == 1){
            System.out.println("第一个是 1 的解法有："+count_1);
        }
        if (count_3 == 1){
            System.out.println("第一个是 2 的解法有："+count_2);
        }
        if (count_4 == 1){
            System.out.println("第一个是 3 的解法有："+count_3);
        }
        if (count_5 == 1){
            System.out.println("第一个是 4 的解法有："+count_4);
        }
        if (count_6 == 1){
            System.out.println("第一个是 5 的解法有："+count_5);
        }
        if (count_7 == 1){
            System.out.println("第一个是 6 的解法有："+count_6);
        }
    }
}
