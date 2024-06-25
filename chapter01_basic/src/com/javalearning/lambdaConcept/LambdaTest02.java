package com.javalearning.lambdaConcept;

/**
 * Lambda表达式的使用
 *   有参数无返回值的函数式接口
 * Lambda语法精简：
 *  1. 形参类型可以省略，如果省略，每个形参类型都要省略
 *  2. 形参如果只有一个的情况下，形参类型和小括号都可省略
 *  3. 如方法体只有一行语句，大括号可省略
 *  4. 如方法体只有一行return语句，大括号和return都可省略
 */

public class LambdaTest02 {
    public static void main(String[] args) {
        HasParamNoReturn hpnr = new HasParamNoReturn() {
            @Override
            public void test(Integer num) {
                System.out.println(num);
            }
        };

        hpnr.test(10);

        HasParamNoReturn hpnr2 = num -> System.out.println(num);
        hpnr2.test(100);
    }
}

interface HasParamNoReturn{
    void test(Integer num);
}

