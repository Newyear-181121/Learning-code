package innerclasses.i_5_在方法和作用域内的内部类;

public class TestP5 {
    public static void main(String[] args){
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Tasmania");
        System.out.println(d.readLabel("在方法外调用的内部类方法"));
    }
}
