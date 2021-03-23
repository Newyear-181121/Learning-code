package ny.base.lambda;

import ny.base.常用类.myUtil.Out;

/**
 * @auther: NewYear
 * @Date: 2020-11-27 15:21
 * @version: 0.0.1
 * @description: TestLamdba  lamdba 表达式的推导。 带参数的 方法
 */
public class TestLamdba002 {

    public static void main(String[] args) {
        ILove love = (String name) -> {
            Out.out("自定义Lambda接口--- 外部类  001    "+name);
        };

        love.lambda("test");

        //   简化

        love = (name) -> {
            Out.out("自定义Lambda接口--- 外部类  001    "+name);
        };
        love.lambda("lambda2-->");

        love = name -> Out.out("自定义Lambda接口的实现--- Lambda表达式  002    ",name);
        love.lambda("test003");
    }
}


interface ILove{
    void lambda(String name);
}

/**
 * 外部类
 */
class Love implements ILove {
    @Override
    public void lambda(String name) {
        Out.out("自定义Lambda接口--- 外部类  001    "+name);
    }
}
