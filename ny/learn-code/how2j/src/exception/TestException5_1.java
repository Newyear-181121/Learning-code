package exception;


/**
 * �����Զ����쳣
 * 				�쳣��EnemyHeroIsDeadException     �̳�Exception
 * @author New year
 *
 */
public class TestException5_1 extends Exception{		//�Զ�����쳣Ҫ�̳�exception�쳣��
														//�൱�ڴ�����һ�������֣�һ���쳣������
	
	//����һ���޲εĹ��췽��
	public TestException5_1(){
        
    }
	
	//����һ���вεĹ��췽��
    public TestException5_1(String msg){
    	
    	//���ø���Ķ�Ӧ�Ĺ��췽��
        super(msg);
    }
}
