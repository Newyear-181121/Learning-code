package exception;


/**
 * �׳��Զ����쳣
 * 			����һ�����࣬ʹ���׳��ոն�������쳣
 * @author New year
 *
 */
public class TestException5_2 {

	public String name;
	protected float hp;
	
	
	//��������       ��������    ���׳��쳣������     �쳣����Ϊ���쳣���ǣ� ���쳣
	//throws ������ ����������У����ܻ����쳣�׳�������һ�������쳣�׳�
	public void attackHero(TestException5_2 h) throws TestException5_1{
		
		//�������Ӣ��Ѫ��Ϊ�㣬��ʾ�ѽ����ˣ��ͻᴥ�����
		
		if(h.hp == 0){		//���Ѫ��Ϊ�㣬��ִ���׳��쳣
			
			//throw���׳� ����������͵��쳣 
			throw new TestException5_1(h.name + "�Ѿ����ˣ�����Ҫʩ�ż���");
		}
	}
	
	public String toString(){
		return name;
		
	}
	
	
	/*
	 * 
	 *  //������Ѿ�������İ��д�����         �Ǻ�׺Ϊ   5_1 �����
	class EnemyHeroIsDeadException extends Exception{
        
        public EnemyHeroIsDeadException(){
             
        }
        public EnemyHeroIsDeadException(String msg){
            super(msg);
        }
    }
    
    */
	
	public static void main(String[] args){
		
		//������������
		TestException5_2 garen = new TestException5_2();
		garen.name = "����";
		garen.hp = 616;
		
		TestException5_2 teemo = new TestException5_2();
		teemo.name = "��Ī";
		teemo.hp = 0;
		
		try {
			//���ף�����  ��Ī  
			/*{��ĪѪ��Ϊ��  
			 * 		�׳��쳣��
			 * 
			 */
			garen.attackHero(teemo);
			
			//catch   ס����쳣      Ȼ�����������������£�����ӡ���鿴��������·��
		}catch (TestException5_1 e){
			System.out.println("�쳣�ľ���ԭ��:"+e.getMessage());
            e.printStackTrace();
		}
		
	}
	
	
}
