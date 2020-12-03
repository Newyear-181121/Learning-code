package ny.base.multipleThread.高级主题.可重入锁.不可重入锁;

import ny.base.multipleThread.并发协作.Utils;

/**
 * 
 *
 * @auther: NewYear
 * @Date: 2020-12-03 14:12
 * @version: 0.0.1
 * @description: TestUnLock
 */
public class TestUnLock {
    Lock lock = new Lock();
    public void a(){
        lock.lock();
        b();
        lock.unlock();
    }

    /**
     * 不可重入
     */
    public void b(){
        lock.lock();
        //........
        lock.unlock();
    }

    public static void main(String[] args) {
        TestUnLock l = new TestUnLock();
        l.a();
        l.b();
    }
}

// 不可重入锁
class Lock{
    //是否占用
    private boolean isLocked = false;
    // 使用锁
    public synchronized void lock(){
        while(isLocked){
            Utils.myWait(this);
        }

        isLocked = true;
    }

    /**
     * 释放锁
     */
    public synchronized void unlock(){
        isLocked = false;
        notify();
    }
}