package ny.base.lambda;

import ny.base.常用类.myUtil.Out;

/**
 * @auther: NewYear
 * @Date: 2020-11-27 15:21
 * @version: 0.0.1
 * @description: TestLamdba  lamdba 表达式的推导。
 *      简化的接口 只能有一个抽象方法。
 */
public class TestLamdba {

    /**
     * 内部类
     */
    static class Like2 implements ILike {
        @Override
        public void lambda() {
            Out.out("自定义Lambda接口+++ 内部静态类  002");
        }
    }

    public static void main(String[] args) {
        ILike il = new Like();
        ILike il2 = new Like2();

        class Like3 implements ILike {
            @Override
            public void lambda() {
                Out.out("自定义Lambda接口*** 方法内部类  003");
            }
        }
        ILike il3 = new Like3();

        ILike il4 = new ILike(){

            public void lambda() {
                Out.out("自定义Lambda接口--- 匿名内部类  004 ");
            }
        };
        /**
         * Lambdaa推导的时候一定要有类型。
         */
        ILike il5 = () -> {
            Out.out("自定义Lambda接口--- Lamdba  005");
        };


        il.lambda();
        il2.lambda();
        il3.lambda();
        il4.lambda();
        il5.lambda();



    }
}


interface ILike {
    void lambda();
}

/**
 * 外部类
 */
class Like implements ILike {
    @Override
    public void lambda() {
        Out.out("自定义Lambda接口--- 外部类  001    ");
    }
}
