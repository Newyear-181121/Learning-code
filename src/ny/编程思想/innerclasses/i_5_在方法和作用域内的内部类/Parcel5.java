package innerclasses.i_5_在方法和作用域内的内部类;

/**
 * 展示在方法作用域内，创建一个完整的类。
 *      这被称为 局部内部类，
 */
public class Parcel5 {


    public Destination destination(String s){

        class PDestination implements Destination{
            private String label;
            private PDestination(String whereTo){
                System.out.println("只有当方法被调用的时候，构造方法才被调用");
                label = whereTo;
            }
            public String readLabel(String str){
                System.out.println(str);
                return label;
            }
        }
        System.out.println("destination方法被调用");
        PDestination p = new PDestination(s);
        p.readLabel("在方法内调用的内部类的方法");
        return p;   //返回内部类的对象。
    }

    public static void main(String[] args){
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Tasmania");
        System.out.println(d.readLabel("在方法外调用的内部类方法"));
    }
    /**
     * 这个内部类的作用域是在方法内，出了方法就不行了。
     */
}




interface Destination{
    String readLabel(String str);
}