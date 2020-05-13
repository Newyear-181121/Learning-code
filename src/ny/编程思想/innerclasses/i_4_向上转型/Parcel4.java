package innerclasses.i_4_向上转型;

/**
 * Parcel : 包
 */
public class Parcel4 {
    //封装简化输出。
    public void out(String str){
        System.out.println(str);
    }
    /**
     * 内部类实现了一个接口，，这是一个私有化的内部类。
     */
    private class PContents implements Contents {
        private int i = 11;
        public PContents(){
            System.out.println("这个私有化的内部类的构造方法被调用了。");
        }
        public int value() {
            System.out.println("实现接口Contents的方法。");
            return i;
        }
    }
    protected class PDestination implements Destination{
        private String label;
        private PDestination(String whereTo){
            out("protected内部类，的私有方法被执行了。");
            label = whereTo;
        }
        public String readLabel() {
            out("接口Destination的方法被实现了，切被执行了。");
            return label;
        }
    }
    public Destination destination(String s){
        out("create a inner object -- Destination");
        return new PDestination(s);
    }
    public Contents contents() {
        out("create a inner object -- Pcontents");
        return new PContents();
    }

}
