package ny.how2j.a_myDemo;

public class test {
    public void a1(){
        a a1 = new a();
        a1.run();
        //不可以。
       // a1.run(){ System.out.println(""); };
    }
}

class a{
    public void run(){
        System.out.println("别人写的。");
    }
}


class b extends a{
    @Override
    public void run(){
        System.out.println("我自己写的方法");
    }
}