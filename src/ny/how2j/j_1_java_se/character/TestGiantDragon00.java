package character;

public class TestGiantDragon00 {
	public static void main(String[] args) {
        //通过new实例化会报错
//      GiantDragon00 g = new GiantDragon00();
         
        //只能通过getInstance得到对象
         
        GiantDragon00 g1 = GiantDragon00.getInstance();
        GiantDragon00 g2 = GiantDragon00.getInstance();
        GiantDragon00 g3 = GiantDragon00.getInstance();
         
        //都是同一个对象
        System.out.println(g1==g2);
        System.out.println(g1==g3);
    }

}
