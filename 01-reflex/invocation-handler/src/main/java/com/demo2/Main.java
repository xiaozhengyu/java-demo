package com.demo2;

import com.demo1.MyImplement;
import net.sf.cglib.proxy.Enhancer;

/**
 * @author xzy.xiao
 * @date 2023/11/2  19:08
 */
class Main {
    public static void main(String[] args) {
        // 动态代理没有实现接口的类
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(MyNoInterfaceClass.class);
        enhancer.setCallback(new MyMethodInterceptor());

        MyNoInterfaceClass proxyObject = (MyNoInterfaceClass) enhancer.create();
        proxyObject.doSomething();

        // 动态代理实现了接口的类
        Enhancer enhancer2 = new Enhancer();
        enhancer2.setSuperclass(MyImplement.class);
        enhancer2.setCallback(new MyMethodInterceptor());

        MyImplement proxyObject2 = (MyImplement) enhancer2.create();
        proxyObject2.doSomething();
    }
}
