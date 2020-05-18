package innerclasses.i_6_匿名内部类;

import innerclasses.i_4_向上转型.Destination;

public class Parcel10 {
    public Destination destination(final String dest,final float price) {
        return new Destination() {
            @Override
            public String readLabel() {
                return null;
            }

            private int cost;
            {
                cost = Math.round(price);
                if (cost > 100)
                    System.out.println("Over budget");
            }

            private String label = dest;

            public String readLabd() {
                return label;
            }
        };
    }
    public  static void mian(String[] args){
        Parcel10 p = new Parcel10();
        Destination d = p.destination("Tasmania",101.395F);
    }
}
