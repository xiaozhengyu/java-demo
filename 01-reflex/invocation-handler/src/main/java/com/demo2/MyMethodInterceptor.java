package com.demo2;

import lombok.extern.slf4j.Slf4j;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author xzy.xiao
 * @date 2023/11/2  19:05
 */
@Slf4j
public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        log.info("Before invoke real object.");
        Object result = methodProxy.invokeSuper(obj, args);
        log.info("After invoke real object.");
        return result;
    }
}
