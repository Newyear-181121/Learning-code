package ny.base.lambda;

import ny.base.常用类.myUtil.Out;

/**
 * @auther: NewYear
 * @Date: 2020-11-30 10:56
 * @version: 0.0.1
 * @description: TestLamdba003 带多个参数的 表达式使用方式演示。
 */
public class TestLamdba003 {
    public static void main(String[] args) {

        /**
         * 重新实现了新的方法，
         */
        ILam003 i = (int a,int b) -> {
            Out.out("自定义Lambda接口--- 外部类  001    "+a,"第二个参数："+b);
            return a+b;
        };
        i.lambda(100,200);  // 调用


        i = (a,b) -> {
            Out.out("自定义Lambda接口--- 外部类  001    "+a,"第二个参数："+b);
            return a+b;
        };
        i.lambda(100,200);  // 调用


        /**
         * 如果只有一行代码，是否可以省略
         */
        i = (a,b) -> {
            return a+b;
        };
        i.lambda(100,200);  // 调用


        i = (a,b) ->a+b;
        i.lambda(100,200);  // 调用

    }
}

interface ILam003{
    int lambda(int a ,int b);
}

/**
 * 外部类
 */
class lam003 implements ILam003 {
    @Override
    public int lambda(int a,int b) {
        Out.out("自定义Lambda接口--- 外部类  001    "+a,"第二个参数："+b);
        return a+b;
    }
}