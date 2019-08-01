package multiplethread;


/**
 * 给  2-3   用的
 * @author New year
 *
 */
public class Hero2_3 {

	public String name;
    public float hp;
      
    public int damage;
      
    public void attackHero(Hero2_3 h) {
        //把暂停时间去掉，多条线程各自会尽力去占有CPU资源
        //线程的优先级效果才可以看得出来
//        try {
//           
//            Thread.sleep(0);
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        h.hp-=damage;
        System.out.format("%s 正在攻击 %s, %s的血变成了 %.0f%n",name,h.name,h.name,h.hp);
          
        if(h.isDead2_3())
            System.out.println(h.name +"死了！");
    }
  
    public boolean isDead2_3() {
        return 0>=hp?true:false;
    }
  
}
