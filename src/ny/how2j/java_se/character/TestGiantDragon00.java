package character;

public class TestGiantDragon00 {
	public static void main(String[] args) {
        //ͨ��newʵ�����ᱨ��
//      GiantDragon00 g = new GiantDragon00();
         
        //ֻ��ͨ��getInstance�õ�����
         
        GiantDragon00 g1 = GiantDragon00.getInstance();
        GiantDragon00 g2 = GiantDragon00.getInstance();
        GiantDragon00 g3 = GiantDragon00.getInstance();
         
        //����ͬһ������
        System.out.println(g1==g2);
        System.out.println(g1==g3);
    }

}
