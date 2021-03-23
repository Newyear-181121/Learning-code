package innerclasses.i_2_connection;

/**
 * Sequence:序列
 */
public class Sequence {
    private Object[] items;
    private int next= 0;
    public void add(Object x){
        if (next < items.length)
            items[next++] =x;
    }
    public Sequence(int size){
        items = new Object[size];
    }

    /**
     * 通过内部类，自定义实现接口方法，并在外部类中增加一个创建内部类对象的公共方法，
     *
     * 意义：灵活的实现自定义接口方法。
     */
    private class SequenceSelector implements Selector {
        private int i = 0;
        public boolean end(){
            return i == items.length;
        }
        public Object current(){
            return items[i];
        }
        public void next(){
            if(i < items.length) i++;
        }
    }
    //放开一个方法，创建内部类的对象。
    public Selector selector (){
        return new SequenceSelector();
    }
    public static void main(String[] args){
        Sequence sequence = new Sequence(10);
        for(int i = 0 ; i < 10 ; i++ ){
            sequence.add(Integer.toString(i));
        }
        // 通过接口声明，创建内部类的对象，并引用。
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}
