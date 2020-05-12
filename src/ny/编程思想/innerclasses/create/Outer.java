package innerclasses.create;

public class Outer {
    class Inner{
        Inner(){
            System.out.println("内部类的无参构造方法");
        }
        Outer out(){
            System.out.println("内部类的方法");
            return new Outer();
        }
    }
    Inner out_inner(){
        System.out.println("Outer class method \n 外部类的方法");
        return new Inner();
    }
    public static void main(String[] args){
        Outer o = new Outer();
        Outer.Inner i = o.out_inner();
        i.out();
        /**
         * Outer.Inner s = new Inner();
         * 内部类不是静态类，不能直接在静态方法中创建。
         */

    }
}
