package multiplethread_3;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * AtomicInteger
 * @author New year
 *
 *JDK6 �Ժ���������һ����java.util.concurrent.atomic�������и���ԭ���࣬����AtomicInteger��
 *��AtomicInteger�ṩ�˸����������Լ��ȷ�������Щ��������ԭ���Եġ� ���仰˵���������� incrementAndGet ���̰߳�ȫ�ģ�ͬһ��ʱ�䣬ֻ��һ���߳̿��Ե������������
 *����Ƚ� ���ƴ���
 *
 */
public class TestThread9_2 {

	public static void main(String[] args) {

		AtomicInteger atomicI = new AtomicInteger();
		int i = atomicI.decrementAndGet();
		int j = atomicI.incrementAndGet();
		int k = atomicI.addAndGet(3);
	}

}
