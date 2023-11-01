package com.demo1;

import java.lang.reflect.Proxy;

/**
 * @author xzy.xiao
 * @date 2023/11/1  20:04
 */
public class Main {
    public static void main(String[] args) {
        MyInterface realObject = new MyImplement();

        MyInterface proxyObject = (MyInterface) Proxy.newProxyInstance(
                realObject.getClass().getClassLoader(),
                realObject.getClass().getInterfaces(),
                new MyInvocationHandler(realObject)
        );

        realObject.doSomething();
        proxyObject.doSomething();
    }
}
