package multiplethread_3;


/**
 * ���õĽ����ʽ     		�����������
 * @author New year
 *
 */
public class TestThread6_1 {

	public static void main(String[] args) {

		final Hero6_1 gareen= new Hero6_1() ;
		gareen.name = "����";
		gareen.hp = 616;
		gareen.damage = 60 ;
		
		Thread t1 = new Thread() {
			public void run() {
				int i = 0 ;
				while(true) {
					
					System.out.printf("t1�̣߳���%d��ִ��",i);
					i++;
					
					
					//��Ϊ��Ѫ���죬���Ը��׵�Ѫ������ᵽ��1
                    //ʹ��whileѭ���ж��Ƿ���1�������1�Ͳ�ͣ��ѭ��
                    //ֱ����Ѫ�̻߳ظ���Ѫ��
				//	while(gareen.hp==1){
				//		continue;
				//	}
					
					if(gareen.isDead()){
						System.out.println("�Ѿ�ûѪ��");
						break;
					}
					gareen.attackHero(gareen);
					
					gareen.hurt();
					System.out.printf("t1 Ϊ%s ��Ѫ1��,����Ѫ��%s��Ѫ����%.0f%n",gareen.name,gareen.name,gareen.hp);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
			}
		};
		t1.start();
		
		Thread t2 = new Thread() {		//���߳��ڲ�������дrun���������������߳�
			public void run() {
				int i = 0; 
				while(true) {
					
					System.out.printf("t2�̣߳���%d��ִ�У�",i);
					i++;
					
					if(gareen.isHealth()){
						System.out.println("Ѫ���Ѿ�������");
						break;
					}
					
					
					gareen.recover();
					System.out.printf("t2 Ϊ%s ��Ѫ1��,����Ѫ��%s��Ѫ����%.0f%n",gareen.name,gareen.name,gareen.hp);
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		t2.start(); 		//�߳����������������̣߳�
		
		
	}
	
	

}
