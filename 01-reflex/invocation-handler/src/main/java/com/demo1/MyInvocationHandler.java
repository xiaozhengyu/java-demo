package com.demo1;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author xzy.xiao
 * @date 2023/11/1  20:02
 */
@Slf4j
public class MyInvocationHandler implements InvocationHandler {

    private final MyInterface realObject;

    public MyInvocationHandler(MyInterface realObject) {
        this.realObject = realObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info("Before invoke real object.");
        Object result = method.invoke(realObject, args);
        log.info("After invoke real object.");
        return result;
    }
}
