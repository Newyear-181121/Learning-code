package innerclasses.i_6_匿名内部类;

import innerclasses.i_4_向上转型.Contents;

/**
 * 匿名累不类的声明。
 */
public class Parcel7 {
    public Contents contents(){
        return new Contents() {
            private int i = 11;
            @Override
            public int value() {
                return i;
            }
        };
    }
    public static void main(String args){
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
    }
}
