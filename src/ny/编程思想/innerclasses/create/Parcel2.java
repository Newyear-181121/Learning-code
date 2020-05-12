package innerclasses.create;

public class Parcel2 {

    /**
     * 内容
     */
    class Contents {
        private int i = 11 ;
        public int value(){
            return i ;
        }

    }

    /**
     * 目的地
     */
    class Destination {
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readLabel(){
            return label;
        }
    }

    public Destination to(String s){
        // 非静态类，可以在非静态方法中创建。
        return new Destination(s);
    }

    public Contents contents(){
        return new Contents();
    }

    public void ship(String dest){
        Contents c = contents();
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }
    public static void main(String[] args){
        Parcel2 p = new Parcel2();
        p.ship("Tasmania");

        Parcel2 q = new Parcel2();
        Parcel2.Contents c = q.contents();
        Parcel2.Destination d = q.to("Borneo");
    }
}

