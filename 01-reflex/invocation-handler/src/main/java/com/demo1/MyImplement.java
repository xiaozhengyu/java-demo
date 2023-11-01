package com.demo1;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xzy.xiao
 * @date 2023/11/1  19:58
 */
@Slf4j
public class MyImplement implements MyInterface {
    @Override
    public void doSomething() {
        log.info("Real object is doing something...");
    }
}
