package multiplethread;


/**
 * ��  2-3   �õ�
 * @author New year
 *
 */
public class Hero2_3 {

	public String name;
    public float hp;
      
    public int damage;
      
    public void attackHero(Hero2_3 h) {
        //����ͣʱ��ȥ���������̸߳��Իᾡ��ȥռ��CPU��Դ
        //�̵߳����ȼ�Ч���ſ��Կ��ó���
//        try {
//           
//            Thread.sleep(0);
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        h.hp-=damage;
        System.out.format("%s ���ڹ��� %s, %s��Ѫ����� %.0f%n",name,h.name,h.name,h.hp);
          
        if(h.isDead2_3())
            System.out.println(h.name +"���ˣ�");
    }
  
    public boolean isDead2_3() {
        return 0>=hp?true:false;
    }
  
}
