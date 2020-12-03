package ny.base.multipleThread.高级主题.可重入锁.不可重入锁;

import ny.base.multipleThread.并发协作.Utils;
import ny.base.常用类.myUtil.Out;

/**
 * 
 *
 * @auther: NewYear
 * @Date: 2020-12-03 14:12
 * @version: 0.0.1
 * @description: TestUnLock
 */
public class TestLock {
    ReLock lock = new ReLock();
    public void a(){
        lock.lock();
        Out.out(lock.getHoldLock());
        b();
        lock.unlock();
        Out.out(lock.getHoldLock());
    }

    /**
     * 不可重入
     */
    public void b(){
        lock.lock();
        Out.out(lock.getHoldLock());
        //........
        lock.unlock();
        Out.out(lock.getHoldLock());
    }

    public static void main(String[] args) {
        TestLock l = new TestLock();
        l.a();
    }
}

// 不可重入锁
class ReLock{
    //是否占用
    private boolean isLocked = false;
    private Thread lockedBy = null;     //存储获得锁的线程，
    private int holdLock = 0 ; // 锁的计数器
    // 使用锁
    public synchronized void lock(){
        Thread t = Thread.currentThread();
        while(isLocked && lockedBy != t){
            Utils.myWait(this);
        }

        isLocked = true;
        lockedBy = t;
        holdLock++;
    }

    /**
     * 释放锁
     */
    public synchronized void unlock(){
        Thread t = Thread.currentThread();
        if (t == lockedBy){
            holdLock--;
            if (holdLock == 0){
                isLocked = false;
                notify();
                lockedBy = null;
            }
        }

    }

    public int getHoldLock() {
        return holdLock;
    }
}