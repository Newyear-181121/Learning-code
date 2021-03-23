package innerclasses.i_3_use;

/**
 * Creating an inner class directly using the .new syntax
 * 使用.new语法直接创建内部类
 */
public class DotNew {
    public class Inner{}
    public static void main(String[] args){
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }


}
