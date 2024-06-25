package com.javalearning.lambdaConcept;

/**
 * Lambda表达式的使用
 *  无参数无返回值的函数式接口
 */
public class LambdaTest01 {
    public static void main(String[] args) {

        // 匿名内部类方式
        NoParamsNoReturn npnr = new NoParamsNoReturn() {
            @Override
            public void test() {
                System.out.println("无参无返回值的方法执行了。");
            }
        };
        npnr.test();

        // Lambda表达式
        NoParamsNoReturn npnr2 = () -> {
            System.out.println("Lambda表达式执行了。");
        };
        npnr2.test();
    }
}

@FunctionalInterface
interface NoParamsNoReturn {
    void test();
}

