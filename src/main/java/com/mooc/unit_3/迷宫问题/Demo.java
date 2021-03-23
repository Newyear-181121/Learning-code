package com.mooc.unit_3.迷宫问题;

/**
 * 这个链表是反向链表，，不停的再头节点加新的 栈头。
 */
public class Demo {
    int[][] maze = {{1,1,0,0},{1,1,1,0},{1,0,0,0},{1,1,1,1}};
    int[][] maze2 ={{0,0,1,0,0,0,1,0},
                    {0,0,1,0,0,0,1,0},
                    {0,0,0,0,1,1,0,1},
                    {0,1,1,1,0,0,1,0},
                    {0,0,0,1,0,0,0,0},
                    {0,1,0,0,0,1,0,1},
                    {0,1,1,1,1,0,0,1},
                    {1,1,0,0,0,1,0,1},
                    {1,1,0,0,0,0,0,0}};
    StackNode top = new StackNode(0);
    /**
     * 判断方向是否能走，
     * 能则入栈。当发现所有方向都不可行时，实现退栈并且找到新的路。
     * @param s  栈
     */
    public void advance(Demo s){
        StackNode p = s.top;
        int i = 0;
        while (true) {
            // 取反是判断该方向来的方向，是否已经走过的，不能再走了。
            if (li(p.direction) != i && maze[p.y + gety(i)][p.x + getx(i)] == 1) {
                push(s, (p.x + getx(i)), p.y + gety(i), i);
                break;
            }
            i++;
            if (i == 4){ // 如果四个方向都不能走，
                pop(s);
                back(s);
                break;
            }
        }
    }

    /**
     * 主要用来将当前可走的方向和那个方向对应的坐标存入栈中，
     *      并且将上一节点的方向值修改为栈顶的方向。
     * @param s 栈
     * @param x
     * @param y
     * @param direction
     */
    public void push(Demo s,int x,int y,int direction){
        StackNode p = new StackNode();
        p.x = x;
        p.y = y;
        p.direction = direction;
        p.next = s.top;
        s.top = p;
        if (p.next != null){
            p.next.direction = direction;
        }
        System.out.printf("建立x=%2d y=%2d d=%d\n",p.next.y,p.next.x,p.next.direction);
    }

    /**
     * 用来转换下一个方向，判断下一个可走的方向并且存入栈中。
     * @param s
     */
    public void back(Demo s){
        StackNode p = s.top;
        int i= ++ p.direction; //换一个方向。
        while(true){
            if (i == 4){
                pop(s);
                back(s);
                break;
            }
            if (li(p.next.direction) != i && maze[p.y+gety(i)][p.x+getx(i)] == 1){
                push(s,p.x+getx(i),p.y+gety(i),i);
                break;
            }
            i++;
        }
    }

    /**
     * 如果当前方向不可行就删除栈顶元素。
     * @param s
     */
    public void pop(Demo s){
        StackNode p = s.top;
        if (p != null){
            s.top= p.next;
            System.out.printf("撤销x=%2d y=%2d d=%d\n",s.top.y,s.top.x,s.top.direction);
        }
    }

    /**
     * 取反方向
     * @param x
     */
    public int li(int x){
        int a[] = {2,3,0,1};
        return a[x];
    }

    /**
     * 根据方向获取，坐标变化
     * @param direction  方向
     * @return  返回增量
     */
    public int gety(int direction){
        int a[]={1,0,-1,0};
        return a[direction];
    }

    public int getx(int direction){
        int a[] = {0,1,0,-1};
        return a[direction];
    }


    public static void main(String[] args){
        StackNode node = null;
        //advance();
    }
}
