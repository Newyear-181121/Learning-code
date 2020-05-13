package innerclasses.i_2_connection;

/**
 * 练习
 */
public class Test2 {
    private String value;
    public void add(String x){
        this.value = x;
    }
    public String toString(){
        value = this.getClass().toString();
        return value;
    }

    private Test2(){
        this("10");
    }
    private Test2(String x){
        this.value = x  ;
    }

    class Inner{
        public String toSting(){
            return value;
        }
    }
    public Inner inner(){
        return new Inner();
    }

    public static void main(String[] args) {
        Sequence s = new Sequence(10);
        for (int i = 0 ; i < 10 ; i++ ){
            Test2 t = new Test2();
            s.add(t);
        }
        Selector selector = s.selector();
        while(!selector.end()) {
            System.out.println(selector.current() + " ");
            selector.next();
        }


        Test2.Inner in = new Test2().inner();
        System.out.println(in.toSting());
    }
}
