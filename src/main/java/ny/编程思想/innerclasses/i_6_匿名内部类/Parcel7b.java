package innerclasses.i_6_匿名内部类;

import innerclasses.i_4_向上转型.Contents;

public class Parcel7b {
    class MyContents implements Contents {
        private int i = 30  ;
        public int value(){
            return i;
        }
    }
    public Contents contents(){
        return new MyContents();
    }
    public static void main(String[] args){
        Parcel7b p = new Parcel7b();
        Contents c = p.contents();
    }
}
