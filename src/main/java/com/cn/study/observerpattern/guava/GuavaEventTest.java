package com.cn.study.observerpattern.guava;

import com.google.common.eventbus.EventBus;

public class GuavaEventTest {
    public static void main(String[] args) {
        //消息总线
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post("Tom");

        //从Struts到SpringMVC的升级
        //因为Struts面向的是类，而SpringMVC面向的是方法

        //前面两者面试的类，Guava面向的是方法

        //Guava是能够轻松落地观察者模式的一种解决方案。
        //MQ消息中间件


    }

}
