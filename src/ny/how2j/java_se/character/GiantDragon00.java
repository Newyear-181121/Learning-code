package character;

public class GiantDragon00 {
	//˽�л����췽��ʹ�ø����޷����ⲿͨ��new ����ʵ����
    private GiantDragon00(){        
    }
  
    //׼��һ�������ԣ�����ָ��һ��ʵ�������󣬵�����ʱָ��null
    private static GiantDragon00 instance;
      
    //public static ����������ʵ������
    public static GiantDragon00 getInstance(){
        //��һ�η��ʵ�ʱ�򣬷���instanceû��ָ���κζ�����ʱʵ����һ������
        if(null==instance){
            instance = new GiantDragon00();
        }
        //���� instanceָ��Ķ���
        return instance;
    }

}
